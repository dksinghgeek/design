package com.ggn.probs.design.patterns.bookMyShow.payment;

public class UPI implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("UPI payment of " + amount + " is successful");
		return true;
	}

}
