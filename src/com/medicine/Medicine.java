package com.medicine;

public abstract class Medicine {
	private double price;
	private String expiryDate;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	abstract void displayLabel();
	
	public String getDetails(){
		return "Price is : "+price+"\n"+
		"Expiry Date : "+expiryDate;
	}
}
