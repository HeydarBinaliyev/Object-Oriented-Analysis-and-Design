package com.aractakip.arackiralama.domain;

import java.util.Date;

import com.aractakip.other.Money;

public class AracKiralama {
	
	private Date date=new Date();
	public Date getDate(){
		return date;
	}
	
	public Date getT1() {
		return t1;
	}
	public Date getT2() {
		return t2;
	}

	public int getGunsayisi() {
		return gunsayisi;
	}

	private Date t1=new Date();
	private Date t2=new Date();
	private int gunsayisi;
	private Odeme odeme;
	
	public Odeme getOdeme() {
		return odeme;
	}

	private Arac a;
	
	public void setGunSayisi(int gun){
		this.gunsayisi=gun;
	}
	public void setTarih(Date t1,Date t2){
		this.t1=t1;
		this.t2=t2;
	}
	public void AracOlustur(AracDescription desc){
		a=new Arac(desc);
	}
	
	public Arac getA() {
		return a;
	}

	public void KartBilgisiGir(String kart_info){
		Money amount=new Money(a.getAracPrice().getPrice());
		odeme=new Odeme(amount.days(gunsayisi), kart_info);
		odeme.setTrue();
	}
	
}
