package com.aractakip.arackiralama.domain;

import com.aractakip.other.Money;

public class Odeme {
	private Money amount;
	private String kart_info;
	private boolean dogrulama=false;
	public Odeme(Money amount,String kart_info) {
		this.amount=amount;
		this.kart_info=kart_info;
	}
	public Money getPrice(){
		return amount;
	}
	public String getKartInfo(){
		return kart_info;
	}
	public void setTrue(){
		dogrulama=true;
	}
	public boolean isDogrulama() {
		return dogrulama;
	}
	
}
