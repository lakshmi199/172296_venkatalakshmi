package com.flipkart.pojo;

public class UserServiceImpl implements UserService {
	
	
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }
//
//	  public User validateUser(Login login) {
//	    return userDao.validateUser(login);
//	  }

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


}
