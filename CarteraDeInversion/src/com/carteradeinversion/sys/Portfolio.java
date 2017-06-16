package com.carteradeinversion.sys;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * Class that handles those assets acquired by the user. Calculates the user's net worth, and overall
 * gains (in $) and returns (in %).
 * 
 * @author Tomas Ferrer
 *
 */
public class Portfolio {
	
	private Set<Asset> holdings;
	private List<Operation> history;
	private double netWorth;
	private double overallGains;
	private double overallReturns;
	
	public Portfolio() {
		holdings = new HashSet<>();
		history = new LinkedList<>();
		netWorth = overallGains = overallReturns = 0;
	}

	public Set<Asset> getHoldings() {
		return Collections.unmodifiableSet(holdings);
	}

	public List<Operation> getHistory() {
		return Collections.unmodifiableList(history);
	}

	public double getNetWorth() {
		calcNetWorth(); //estaria bueno hacer esto solo si pasaron 5min desde la ultima actualizacion
		return netWorth;
	}

	public double getOverallGains() {
		calcGains(); //estaria bueno hacer esto solo si pasaron 5min desde la ultima actualizacion
		return overallGains;
	}

	public double getOverallReturns() {
		calcReturns(); //estaria bueno hacer esto solo si pasaron 5min desde la ultima actualizacion
		return overallReturns;
	}
	
	private void calcGains() {
		overallGains = getAllCurrentValues() - getAllOriginalValues();
	}
	
	private void calcReturns() {
		overallReturns = getAllCurrentValues() / getAllOriginalValues();
	}
	
	private void calcNetWorth() {
		netWorth = getAllCurrentValues();
	}
	
	private double getAllCurrentValues() {
		double sum = 0; 
		for(Asset asset : getHoldings()) {
			sum += asset.getVal();
		}
		return sum;
	}
	
	private double getAllOriginalValues() {
		double sum = 0;
		for(Operation operation : getHistory()) {
			sum += operation.asset.getVal();
		}
		return sum;
	}
	
	/**
	 * Adds an operation to the current portfolio. If the user already had acquired a certain amount of
	 * a specific asset and wishes to buy more, these should be merged.
	 * 
	 * @param operation Operation to be added.
	 */
	public void addOperation(Operation operation) {
		Asset originalState = new Asset(operation.getAsset());
		for(Asset asset : holdings) {
			if(originalState.equals(asset)) {
				asset.setValue(asset.getValue() + originalState.getValue());
				return;
			}
		}
		holdings.add(originalState);
		history.add(operation);
		calcNetWorth();
		calcGains();
		calcReturns();
		writeOperationInHistoryFile(operation);
	}
}
