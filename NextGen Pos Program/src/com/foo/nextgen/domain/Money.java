package com.foo.nextgen.domain;

public class Money {
	public int money;
	public Money(){};
	public Money(int money){
		this.money=money;
	}
	public Money times(int quantity){
		return new Money(quantity*this.money);
	}
	public void add(Money subtotal){
		this.money=this.money+subtotal.money;
	}
	public Money minus(Money total){
		return  new Money(this.money-total.money);
	}
}
