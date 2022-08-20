package com.oop;

public class TestCustomer {

	public static void main(String[] args) {
		
		//non parameterized constructor
		Customer c1 = new Customer();
		c1.setCustomerName("John");
		Address a = new Address("1st Main HSR Layout","Bangalore");
		c1.setResidentialAddress(a);
		System.out.println(c1.customerDetails());
		
		//parameterized constructor
		Customer c2 = new Customer("Jimmy",new Address("1st Garden Road","Pune"));
		System.out.println(c2.customerDetails());
	}

}
