package com.ggn.probs.design.patterns.bookMyShow.payment;

public class Credit implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Credit payment of " + amount + " is successful");
		return true;
	}

}
