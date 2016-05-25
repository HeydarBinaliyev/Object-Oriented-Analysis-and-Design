package com.aractakip.aracbakimgir.domain;

import java.util.LinkedList;
import java.util.List;


public class Sistem {
	List<BakimMasrafiGirme>list;
	Register register;
	public Sistem(){
		register=new Register();
		list=new LinkedList<>();
	}
	public Register getRegister(){
		return register;
	}
}
