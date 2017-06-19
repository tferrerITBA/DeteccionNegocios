package com.carteradeinversion.sys;

import java.util.Date;

public class Opcion extends Derivado{
	public Opcion(double val, double min, double max, double open, double close, int amount, String name, String ticker,
			Date expiration) {
		super(val, min, max, open, close, amount, name, ticker, expiration);
		// TODO Auto-generated constructor stub
	}
	int type;
	double prima;
	Asset subyacente;
	
	
	
	
	public int getType() {
		return type;
	}
	public double getPrima() {
		return prima;
	}
	public Asset getSubyacente() {
		return subyacente;
	}
	
	
	
}
