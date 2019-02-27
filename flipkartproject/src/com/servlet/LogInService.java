package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LogInService {
	public boolean authenticate(String UserId,String Password) {
		
		
			boolean status=false;  
			try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
			      
			PreparedStatement ps=con.prepareStatement("select * from fcustomer where UserId=? and Password=?");  
			ps.setString(1,UserId);  
			ps.setString(2,Password);  
			      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
			          
			}catch(Exception e){System.out.println(e); 
			return status;  
			}
			return status;  
			 
	}

}
