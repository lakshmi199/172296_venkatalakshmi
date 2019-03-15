package com.flipkart.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;


public class UserDaoImpl implements UserDao {
	

	  DataSource datasource;

	
	  JdbcTemplate jdbcTemplate;

	  public void register(User user) {

	    String sql = "insert into fcustomer values(?,?,?,?)";

	    jdbcTemplate.update(sql, new Object[] { user.getUserId(), user.getPassword(), user.getEmailId(), user.getMobileNumber() });
	  }

	  public User validateUser(Login login) {

	    String sql = "select * from myusers where userid='" + login.getUserId() + "' and password='" + login.getPassword()
	        + "'";

	    List<User> users = jdbcTemplate.query(sql, new UserMapper());

	    return users.size() > 0 ? users.get(0) : null;
	  }

	}

	class UserMapper implements RowMapper<User> {

	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();

	    user.setUserId(rs.getString("userid"));
	    user.setPassword(rs.getString("password"));
	  
	    user.setEmailId(rs.getString("emailid"));
	
	    user.setMobileNumber(rs.getInt("mobilenumber"));

	    return user;
	  }

}
