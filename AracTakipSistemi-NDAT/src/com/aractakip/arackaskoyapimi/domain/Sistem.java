package com.aractakip.arackaskoyapimi.domain;

import java.util.LinkedList;
import java.util.List;

public class Sistem {
	List<AracKaskoYapma>list;
	Register register;
	public Sistem(){
		register=new Register();
		list=new LinkedList<>();
	}
	public Register getRegister(){
		return register;
	}
}
