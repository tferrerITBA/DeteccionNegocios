package com.carteradeinversion.sys;
/**
 * 
 * @author Alejandro Santoflaminio & Agustin Bossi
 *
 */
public class Asset {
	
	private double val; 
	private double min; 
	private double max;
	private double open;
	private double close;
	private double variation; 
	private int amount; 
	private final String name;
	private final String ticker;
	
	
	public Asset(double val, double min, double max, double open, double close, int amount, String name,
			String ticker) {
		super();
		this.val = val;
		this.min = min;
		this.max = max;
		this.open = open;
		this.close = close;
		this.amount = amount;
		this.name = name;
		this.ticker = ticker;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ticker == null) ? 0 : ticker.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asset other = (Asset) obj;
		if (ticker == null) {
			if (other.ticker != null)
				return false;
		} else if (!ticker.equals(other.ticker))
			return false;
		return true;
	}

	public double getVal() {
		return val;
	}
	public void setVal(double val) {
		this.val = val;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVariation() {
		return variation;
	}
	public void setVariation(double variation) {
		this.variation = variation;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public String getTicker() {
		return ticker;
	}
	
}
