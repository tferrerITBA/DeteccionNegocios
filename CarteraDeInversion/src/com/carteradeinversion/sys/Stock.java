package com.carteradeinversion.sys;
/**
 * 
 * @author Alejandro Santoflaminio & Agustin Bossi
 *
 */
public class Stock extends Asset{
	public Stock(double val, double min, double max, double open, double close, int amount, String name,
			String ticker) {
		super(val, min, max, open, close, amount, name, ticker);
	}
	private double a52w_high;
	private double a52w_low;

	
	public double getA52w_high() {
		return a52w_high;
	}
	public double getA52w_low() {
		return a52w_low;
	}
	

}
