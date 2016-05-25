package com.aractakip.other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Mysql{

	String user="root";
	String password="";
	String host="jdbc:mysql://localhost:3306/ndat";
	Statement state;
	Connection conn;
	
	public void Connect(){
		try {
			Class.forName("com.mysql.jdbc.Connection");
			conn=(Connection)DriverManager.getConnection(host, user, password);
			state=(Statement)conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ResultSet doQuery(String sql){
		try {
			return state.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
