package com.servlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class registration{

public boolean register(String UserId,String Password ,String EmailId,String MobileNumber)  throws SQLException
	{
		    Connection con =ConnectionFactory.getConnection();
		    String sql =   "insert into fcustomer values (?,?,?,?)";
			  PreparedStatement pst =   con.prepareStatement(sql);
			  pst.setString(1, UserId);
			  pst.setString(2, Password);
			  pst.setString(3, EmailId);
			  pst.setString(4, MobileNumber);
			  pst.executeUpdate();
			
		return true;
	}
}
