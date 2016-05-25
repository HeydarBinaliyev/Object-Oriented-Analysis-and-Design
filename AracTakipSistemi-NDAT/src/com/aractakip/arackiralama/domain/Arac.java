package com.aractakip.arackiralama.domain;

import com.aractakip.other.Money;

public class Arac {
	
	private AracDescription desc;
	
	public Arac(AracDescription desc) {
		this.desc=desc;
	}
	
	public Money getAracPrice(){
		return desc.getPrice();
	}
}
