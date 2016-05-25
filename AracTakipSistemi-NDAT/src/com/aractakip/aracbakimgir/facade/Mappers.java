package com.aractakip.aracbakimgir.facade;

import java.util.HashMap;
import java.util.Map;

import com.aractakip.aracbakimgir.domain.Arac;
public class Mappers{
	
	Map<Class<?>, IMapper>map=new HashMap<>();
	AracMapper AracMapper=new AracMapper();

	
	public Mappers(){
		map.put(Arac.class,AracMapper);
		
	}
	public Object get(Class<?> PersistenceClass){
		return map.get(PersistenceClass);
	}
}
