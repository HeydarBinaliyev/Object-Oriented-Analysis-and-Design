package com.aractakip.arackaskoyapimi.domain;

public class AracKaskoYapma {
	
	private Arac a;
	private Sigorta s;
	private Odeme o;
	
	public void aracsec(AracDescription desc,Sigorta s){
			this.s=s;
			a=new Arac(desc);
	}
	public void kartgir(String kart_info){
		o=new Odeme(s.getPrice(), kart_info);
	}
	
	public Arac getA() {
		return a;
	}
	public void setA(Arac a) {
		this.a = a;
	}
	public Sigorta getS() {
		return s;
	}
	public void setS(Sigorta s) {
		this.s = s;
	}
	public Odeme getO() {
		return o;
	}
	public void setO(Odeme o) {
		this.o = o;
	}
		
}
