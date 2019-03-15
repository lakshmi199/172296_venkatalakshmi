package com.flipkart.pojo;

public class Registration {
	
	private String UserId;
	private String Password;

	private String EmailId;
	private String MobileNumber;
	public Registration(String userId, String password, String emailId, String mobileNumber) {
		super();
		UserId = userId;
		Password = password;
		EmailId = emailId;
		MobileNumber = mobileNumber;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	
	

}
