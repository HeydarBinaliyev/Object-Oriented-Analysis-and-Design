package com.foo.nextgen.domain;

public class Register {
	private ProductCatalog catalog;
	public Sale currentSale;
	public Register(ProductCatalog catalog){
		this.catalog=catalog;
	}
	public void endSale(){
		currentSale.becameComplete();
	}
	public void enterItem(int id,int quantity){
		ProductDescription desc=catalog.getProductDescription(id);
		//System.err.println("getsubtotal at saleslineitem:"+desc.getPrice().money);
		currentSale.makeLineItem(desc, quantity);
	}
	public void makeNewSale(){
		currentSale=new Sale();
	}
	public void makePayment(Money cashTendered){
		currentSale.makePayment(cashTendered);
	}
}
