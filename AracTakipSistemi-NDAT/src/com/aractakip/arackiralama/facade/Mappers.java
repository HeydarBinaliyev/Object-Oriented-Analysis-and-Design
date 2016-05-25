package com.aractakip.arackiralama.facade;

import java.util.HashMap;
import java.util.Map;

import com.aractakip.arackiralama.domain.AracDescription;

public class Mappers{
	
	Map<Class<?>, IMapper>map=new HashMap<>();
	AracDescriptionMapper AracMapper=new AracDescriptionMapper();

	
	public Mappers(){
		map.put(AracDescription.class,AracMapper);
		
	}
	public Object get(Class<?> PersistenceClass){
		return map.get(PersistenceClass);
	}
}
