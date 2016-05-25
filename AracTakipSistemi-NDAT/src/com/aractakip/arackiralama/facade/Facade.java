package com.aractakip.arackiralama.facade;

public class Facade {
	
	Mappers mappers=new Mappers();
	
	public Object get(int oid,Class<?> PersistenceClass){
		IMapper mapper=(IMapper)mappers.get(PersistenceClass);
		return mapper.get(oid);
	}
	public void put(int oid,Object object){
		//bu senaryoda put a gerek yok
	}

}