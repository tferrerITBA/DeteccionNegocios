package com.carteradeinversion.portfolio;

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
		return netWorth;
	}

	public double getOverallGains() {
		return overallGains;
	}

	public double getOverallReturns() {
		return overallReturns;
	}
	
	public void calcGains() {
		
	}
	
	public void calcReturns() {
		
	}
	
	public void calcNetWorth() {
		double sum = 0; 
		for(Asset asset : getHoldings()) {
			sum += asset.getVal();
		}
		netWorth = sum;
	}
	
	

}
