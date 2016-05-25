package com.aractakip.aracbakimgir.domain;

import com.aractakip.aracbakimgir.facade.Facade;
import com.aractakip.other.Money;

public class BakimMasrafiGirme {
	Arac a;
	Facade facade;
	public void BakimGir(int aracID,String bakim_sebebi,Money masraf){
		a=new Arac();
		a.setAracID(aracID);
		a.setBakim_sebebi(bakim_sebebi);
		a.setMasraf(masraf);
		facade.put(aracID, a);
		
	}
	public Arac getA() {
		return a;
	}
}
