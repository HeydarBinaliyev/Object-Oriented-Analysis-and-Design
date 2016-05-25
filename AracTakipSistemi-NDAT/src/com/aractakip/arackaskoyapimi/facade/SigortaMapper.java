package com.aractakip.arackaskoyapimi.facade;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.aractakip.arackaskoyapimi.domain.Sigorta;
import com.aractakip.other.DB_Mysql;
import com.aractakip.other.Money;

public class SigortaMapper implements IMapper {

	DB_Mysql db;
	ResultSet rs;
	public SigortaMapper() {
		db=new DB_Mysql();
	}
	@Override
	public Object get(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(int oid, Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(String model) {
		// TODO Auto-generated method stub
		Sigorta s;
		Money price = null;
		String sql="select* from sigorta where model="+model;
		db.Connect();
		rs=db.doQuery(sql);
		try {
			rs.next();
			price=new Money(rs.getInt("price"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=new Sigorta(model, price);
		return s;
	}

}
