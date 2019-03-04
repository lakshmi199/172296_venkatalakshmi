package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cart 
{ 
	
public boolean add(String Username,String Brand,String Price,String Storage) throws SQLException, ClassNotFoundException {
		 
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
			String sql="insert into cart values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,Username);  
			ps.setString(2,Brand);
			ps.setString(3,Price);
			ps.setString(4,Storage);
			ResultSet rs=ps.executeQuery();  
			return true;  
			 	      
 	}
}
	
