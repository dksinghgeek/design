package com.ggn.probs.design.patterns.bookMyShow.payment;

public class Debit implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Debit payment of " + amount + " is successful");
		return true;
	}

}
