package com.oop;

public class Address {
	
	private String addressLine;
	private String city;
	
	
	public Address(String addressLine, String city) {
		this.addressLine = addressLine;
		this.city = city;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddressDetails(){
		return addressLine+","+city;
	}
	
}
