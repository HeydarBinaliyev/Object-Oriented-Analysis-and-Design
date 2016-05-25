package com.aractakip.aracbakimgir.domain;

import com.aractakip.other.Money;

public class Arac {
	Money masraf;
	String bakim_sebebi;
	int aracID;
	public Money getMasraf() {
		return masraf;
	}
	public void setMasraf(Money masraf) {
		this.masraf = masraf;
	}
	public String getBakim_sebebi() {
		return bakim_sebebi;
	}
	public void setBakim_sebebi(String bakim_sebebi) {
		this.bakim_sebebi = bakim_sebebi;
	}
	public int getAracID() {
		return aracID;
	}
	public void setAracID(int aracID) {
		this.aracID = aracID;
	}
}
