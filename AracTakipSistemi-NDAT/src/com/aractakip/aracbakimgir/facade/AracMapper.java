package com.aractakip.aracbakimgir.facade;

import java.sql.ResultSet;


import com.aractakip.aracbakimgir.domain.Arac;
import com.aractakip.other.DB_Mysql;
import com.aractakip.other.Money;

public class AracMapper implements IMapper{

	DB_Mysql db;
	ResultSet rs;
	
	public AracMapper() {
		db=new DB_Mysql();
	}
	
	@Override
	public Object get(int oid) {
		return null;
	}

	@Override
	public void put(int oid, Object obj) {
		Arac a=(Arac) obj;
		Money m=a.getMasraf();
		String sebeb=a.getBakim_sebebi();
		int aracID=a.getAracID();
		String sql="insert into arac_bakimlari(id,sebeb,masraf) values("+aracID+","+sebeb+","+m.getPrice()+")";
		db.Connect();
		db.doQuery(sql);
	}

}
