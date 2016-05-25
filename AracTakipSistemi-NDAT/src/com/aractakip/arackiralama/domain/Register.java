package com.aractakip.arackiralama.domain;

import java.util.Date;

import com.aractakip.arackiralama.facade.Facade;

public class Register{
	
	private AracKiralama ak;
	private Facade facade;
	private Sistem sistem;
	
	public AracKiralama getAk() {
		return ak;
	}
	public void setAk(AracKiralama ak) {
		this.ak = ak;
	}
	public Register(Facade facade){
		this.facade=facade;
	}
	public Register(){}
	public void AracKiralamaBaslat(){
		ak=new AracKiralama();
	}
	public void  TarihSec(Date t1,Date t2){
		ak.setTarih(t1, t2);
	}
	public void AracSec(int aracID){
		AracDescription desc=(AracDescription)facade.get(aracID, AracDescription.class);
		ak.AracOlustur(desc);
	}
	public void KartBilgisiGir(String kart_info){
		ak.KartBilgisiGir(kart_info);
	}
	public void GunSayisiGir(int gun){
		ak.setGunSayisi(gun);
	}
	public Sistem getSistem() {
		return sistem;
	}
	public void bitir(){
		sistem=new Sistem();
		sistem.list.add(ak);
	}
}
