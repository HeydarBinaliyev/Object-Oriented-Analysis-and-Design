package com.aractakip.other;

public class Money {
	
	int price;
	public Money(int price){
		this.price=price;
	}
	public Money days(int days){
		return new Money(days*this.price);
	}
	public int getPrice(){
		return price;
	}
}
