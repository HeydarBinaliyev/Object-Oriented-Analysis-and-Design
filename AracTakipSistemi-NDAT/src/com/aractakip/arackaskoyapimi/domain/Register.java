package com.aractakip.arackaskoyapimi.domain;

import com.aractakip.arackaskoyapimi.facade.Facade;

public class Register {

	private AracKaskoYapma aky;
	private Facade facade;
	public Register() {
		facade=new Facade();
	}
	public void kaskobaslat(){
		aky=new AracKaskoYapma();
	}
	public AracKaskoYapma getAky() {
		return aky;
	}
	public void AracSec(int aracID){
		AracDescription desc=(AracDescription) facade.get(aracID, AracDescription.class);
		Sigorta s=(Sigorta) facade.get(desc.getModel(), Sigorta.class);
		aky.aracsec(desc, s);
		
	}
	public void KartBilgisiGir(String kart_info){
		aky.kartgir(kart_info);
	}
	public void kaydet(){
		new Sistem().list.add(aky);
	}
}
