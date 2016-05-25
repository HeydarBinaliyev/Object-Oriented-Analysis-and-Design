package com.aractakip.arackaskoyapimi.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aractakip.arackaskoyapimi.domain.Register;

public class TestUnit {
	
	@Test
	public void TestRegister_AracSec(){
		Register register=new Register();
		register.kaskobaslat();
		register.AracSec(200);
		assertEquals(250,register.getAky().getS().getPrice().getPrice());
		assertEquals(register.getAky().getA().getDesc().getModel(),register.getAky().getS().getModel());
	}
}
