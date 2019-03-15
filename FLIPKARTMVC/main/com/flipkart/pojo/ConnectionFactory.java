package com.flipkart.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
private static final ConnectionFactory ONE= new ConnectionFactory();
	
	private static Connection conn;
	
	ConnectionFactory()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		} catch (ClassNotFoundException |SQLException e)
		
		{
			e.printStackTrace();
		}
	}
	public static ConnectionFactory getInstance()
	{
		return ONE;
	}
		public static Connection getConnection()
		{
		return conn;
	    }
}
