package com.ggn.probs.design.patterns.bookMyShow.payment;

public class Wallet implements Payment {

	@Override
	public boolean pay(double amount) {
		System.out.println("Wallet payment of " + amount + " is successful");
		return true;
	}

}
