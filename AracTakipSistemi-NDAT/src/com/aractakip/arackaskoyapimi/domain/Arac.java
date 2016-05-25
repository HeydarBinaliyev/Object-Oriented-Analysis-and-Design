package com.aractakip.arackaskoyapimi.domain;

import com.aractakip.other.Money;

public class Arac {
	Money sigorta;
	AracDescription desc;
	public Arac(AracDescription desc){
		this.desc=desc;
	}
	public Money getSigorta() {
		return sigorta;
	}
	public AracDescription getDesc() {
		return desc;
	}
}
