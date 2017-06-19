package com.carteradeinversion.sys;

import java.util.Date;

public class Bono extends Derivado{
	private double tir;
	private double parity;
	
	
	public Bono(double val, double min, double max, double open, double close, int amount, String name, String ticker,
			Date expiration, double tir, double parity) {
		super(val, min, max, open, close, amount, name, ticker, expiration);
		this.tir = tir;
		this.parity = parity;
	}
	public double getTir() {
		return tir;
	}
	public void setTir(double tir) {
		this.tir = tir;
	}
	public double getParity() {
		return parity;
	}

}
