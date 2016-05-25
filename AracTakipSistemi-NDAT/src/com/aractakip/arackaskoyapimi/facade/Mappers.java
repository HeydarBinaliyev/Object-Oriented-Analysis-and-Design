package com.aractakip.arackaskoyapimi.facade;

import java.util.HashMap;
import java.util.Map;

import com.aractakip.arackaskoyapimi.domain.Sigorta;
import com.aractakip.arackiralama.domain.AracDescription;

public class Mappers{
	
	Map<Class<?>, IMapper>map=new HashMap<>();
	AracDescriptionMapper AracMapper=new AracDescriptionMapper();
	SigortaMapper SigMapper=new SigortaMapper();
	
	public Mappers(){
		map.put(AracDescription.class,AracMapper);
		map.put(Sigorta.class, SigMapper);
	}
	public Object get(Class<?> PersistenceClass){
		return map.get(PersistenceClass);
	}
}
