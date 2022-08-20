package com.oop;

public abstract class PrepaidCard {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	abstract boolean swipeCard(int amount);

	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance="
				+ availableBalance + ", swipeLimit=" + swipeLimit + "]";
	}
	
	void rechargeCard(int amount){
		availableBalance+=amount;
	}
}
