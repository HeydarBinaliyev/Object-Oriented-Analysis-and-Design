package com.foo.nextgen.domain;

public class ProductDescription {
	private int id;
	private Money price;
	private String description;
	public ProductDescription(int id,Money price,String description){
		this.id=id;
		this.price=price;
		this.description=description;
	}
	public int getItemID(){return id;};
	public Money getPrice(){return price;}
	public String getDescription(){return description;}
}
