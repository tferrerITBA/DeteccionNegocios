package com.carteradeinversion.sys;

public class Asset {
	
	private double val;
	private double min;
	private double max;
	private double open;
	private double close;
	private double variation;
	private int amount;
	private String name;
	private String ticker;
	
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
