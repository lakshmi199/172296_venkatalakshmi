package com.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements InitializingBean,DisposableBean,ApplicationContextAware {


	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	
	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void getCustomer() {
		
		System.out.println("customerId:" +getCustomerId());
		System.out.println("customerName:" +getCustomerName());
		System.out.println("customerContact:" +getCustomerContact());
		System.out.println("customerAddress:" +getCustomerAddress().getStreet() +getCustomerAddress().getCity() +getCustomerAddress().getState() +getCustomerAddress().getZip() +getCustomerAddress().getCountry());
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroyed Customer");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi customer");
	}
		public void myInit()
		{
			System.out.println("MyInit() called...");
		}
		public void myCleanUp() {
			System.out.println("Cleaned...");
		}
		@Override
		public void setApplicationContext(ApplicationContext context) throws BeansException {
			System.out.println("ApplicationContextAware invoked....");
			System.out.println(context);
		}

	
}
