package com.aractakip.aracbakimgir.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aractakip.aracbakimgir.domain.Register;

public class TestUnit {
	
	@Test
	public void TestRegister_bakimgir(){
		Register register=new Register();
		register.bakimgirmebaslat();
		register.bakimgir(100, "abcd", 100);
		assertEquals(100,register.getBmg().getA().getAracID());
		assertEquals("abcd",register.getBmg().getA().getBakim_sebebi());
		assertEquals(100, register.getBmg().getA().getMasraf().getPrice());
	}
	
}
