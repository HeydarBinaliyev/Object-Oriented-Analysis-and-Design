package com.aractakip.arackaskoyapimi.domain;

import com.aractakip.other.Money;

public class Sigorta {
	String model;
	Money price;
	public Sigorta(String model,Money price) {
		this.model=model;
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Money getPrice() {
		return price;
	}
	public void setPrice(Money price) {
		this.price = price;
	}
	
	
}
