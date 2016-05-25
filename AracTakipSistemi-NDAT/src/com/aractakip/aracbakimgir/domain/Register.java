package com.aractakip.aracbakimgir.domain;

import com.aractakip.other.Money;

public class Register {
	BakimMasrafiGirme bmg;
	Sistem sistem;
	public void bakimgirmebaslat(){
		bmg=new BakimMasrafiGirme();
	}
	public void bakimgir(int aracID,String bakim_sebebi,int masraf){
		Money m=new Money(masraf);
		bmg.BakimGir(aracID, bakim_sebebi, m);
	}
	public BakimMasrafiGirme getBmg() {
		return bmg;
	}
	public void kaydet(){
		sistem=new Sistem();
		sistem.list.add(bmg);
	}
}
