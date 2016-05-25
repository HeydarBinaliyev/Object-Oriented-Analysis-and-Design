package com.aractakip.arackaskoyapimi.domain;

import com.aractakip.other.Money;

public class Odeme {
	private Money amount;
	private String kart_info;
	private boolean dogrulama=false;
	
	public Odeme(Money m,String kart_info){
		this.amount=m;
		this.kart_info=kart_info;
	}
	
	public Money getAmount() {
		return amount;
	}
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	public String getKart_info() {
		return kart_info;
	}
	public void setKart_info(String kart_info) {
		this.kart_info = kart_info;
	}
	public boolean isDogrulama() {
		return dogrulama;
	}
	public void setDogrulama(boolean dogrulama) {
		this.dogrulama = dogrulama;
	}
	
}
