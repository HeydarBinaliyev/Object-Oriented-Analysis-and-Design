package com.aractakip.arackaskoyapimi.domain;
import com.aractakip.other.Money;

public class AracDescription {
	private String model;
	private String marka;
	private int aracID;
	private Money price;
	private int count;
	public AracDescription(String model,String marka,int id,Money price,int count) {
		this.model=model;
		this.marka=marka;
		this.aracID=id;
		this.price=price;
		this.count=count;
	}
	public AracDescription(){}
	
	public String getModel() {
		return model;
	}
	public String getMarka() {
		return marka;
	}
	public int getAracID() {
		return aracID;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public void setAracID(int aracID) {
		this.aracID = aracID;
	}
	public void setPrice(Money price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Money getPrice() {
		return price;
	}
	public int getCount(){
		return count;
	}
	
	
}
