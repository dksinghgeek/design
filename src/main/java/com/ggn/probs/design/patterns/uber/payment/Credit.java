package com.ggn.probs.design.patterns.uber.payment;

public class Credit implements PaymentMethodStrategy {

	@Override
	public void pay(double amount) throws Exception {
		System.out.println("Successful credit Payment of " + amount);
	}

}
