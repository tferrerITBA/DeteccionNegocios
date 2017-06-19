package com.carteradeinversion.sys;

import java.util.Date;

abstract class Derivado extends Asset{
	private Date expiration;
	

	public Date getExpiration() {
		return expiration;
	}

	public Derivado(double val, double min, double max, double open, double close, int amount, String name,
			String ticker, Date expiration) {
		super(val, min, max, open, close, amount, name, ticker);
		this.expiration = expiration;
	}

	
}
