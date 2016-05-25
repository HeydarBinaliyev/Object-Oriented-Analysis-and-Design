package com.aractakip.arackaskoyapimi.facade;

public class Facade {
	
	Mappers mappers=new Mappers();
	
	public Object get(int oid,Class<?> PersistenceClass){
		IMapper mapper=(IMapper)mappers.get(PersistenceClass);
		return mapper.get(oid);
	}
	
	public Object get(String model,Class<?> PersistenceClass){
		IMapper mapper=(IMapper)mappers.get(PersistenceClass);
		return mapper.get(model);
	}
	
	public void put(int oid,Object object){
		//bu senaryoda put a gerek yok
	}

}