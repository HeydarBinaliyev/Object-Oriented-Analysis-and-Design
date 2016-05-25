package com.aractakip.arackaskoyapimi.facade;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.aractakip.arackiralama.domain.AracDescription;
import com.aractakip.other.DB_Mysql;
import com.aractakip.other.Money;

public class AracDescriptionMapper implements IMapper{

	DB_Mysql db;
	ResultSet rs;
	
	public AracDescriptionMapper() {
		db=new DB_Mysql();
	}
	
	@Override
	public Object get(int oid) {
		AracDescription desc=new AracDescription();
		String query="select *from aracdescription where aracID="+oid+";";
		db.Connect();
		rs=db.doQuery(query);
		Money money = null;
		try {
			rs.next();
			int price=rs.getInt("price");
			money = new Money(price);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		desc.setPrice(money);
		return desc;
	}

	@Override
	public void put(int oid, Object obj) {
		//bu senaryoda put a gerek yok
		
	}

	@Override
	public Object get(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
