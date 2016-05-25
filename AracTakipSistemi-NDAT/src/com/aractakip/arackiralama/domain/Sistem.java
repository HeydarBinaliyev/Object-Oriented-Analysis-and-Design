package com.aractakip.arackiralama.domain;

import java.util.LinkedList;
import java.util.List;

import com.aractakip.arackiralama.facade.Facade;


public class Sistem {
	
	List<AracKiralama>list=new LinkedList<AracKiralama>();
	
	private Facade facade=new Facade();
	private Register register=new Register(facade);
	
	public Register getRegister(){
		return register;
	}
}
