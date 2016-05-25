package com.aractakip.arackiralama.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


import com.aractakip.arackiralama.domain.Register;
import com.aractakip.arackiralama.facade.Facade;

public class TestUnit {
	
	
	@Test
	public void testRegister_AracSec(){
		System.out.println("Registr in AracSec metodu test ediliyor...");
		//id si 200 olan aracýn beklenen fiyatýný test et
		Facade facade=new Facade();
		Register register=new Register(facade);
		register.AracKiralamaBaslat();
		register.AracSec(200);
		assertEquals(50,register.getAk().getA().getAracPrice().getPrice());
		
	}
	
	@Test
	public void testRegister_TarihSec(){
		System.out.println("Registr in TarihSec metodu test ediliyor...");
		//tarihler dogru set ediliyormu test et
		Register register=new Register();
		register.AracKiralamaBaslat();
		Date t1=new Date();
		Date t2=new Date();
		register.TarihSec(t1, t2);
		assertEquals(t1, register.getAk().getT1());
		assertEquals(t2, register.getAk().getT2());
		
	}
	@Test
	public void testRegister_KartBilgisiGir(){
		System.out.println("Registr in KartBilgisiGir metodu Test ediliyor...");
		Register register=new Register();
		register.AracKiralamaBaslat();
		register.KartBilgisiGir("abcd");
		assertEquals("abcd", register.getAk().getOdeme().getKartInfo());
	}
	@Test
	public void testRegister_GunsayisiGir(){
		System.out.println("Registr in GunsayisiGir metodu Test ediliyor...");
		Register register=new Register();
		register.AracKiralamaBaslat();
		register.GunSayisiGir(10);
		assertEquals(10, register.getAk().getGunsayisi());
	}
	
}
