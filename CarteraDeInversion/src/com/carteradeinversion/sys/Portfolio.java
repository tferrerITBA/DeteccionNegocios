package com.carteradeinversion.sys;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
	
	protected void addOperation(Operation operation) {
		
	}
}
