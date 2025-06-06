package com.ggn.probs.design.patterns.uber.payment;

public class Wallet implements PaymentMethodStrategy {

	@Override
	public void pay(double amount) throws Exception {
		System.out.println("Successful wallet Payment of " + amount);
	}

}
