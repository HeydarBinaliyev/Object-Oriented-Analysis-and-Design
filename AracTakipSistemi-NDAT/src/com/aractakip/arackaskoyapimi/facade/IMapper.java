package com.aractakip.arackaskoyapimi.facade;

public interface IMapper {
	Object get(int oid);
	void put(int oid,Object obj);
	Object get(String model);
}
