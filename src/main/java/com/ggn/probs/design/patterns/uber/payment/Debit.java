package com.ggn.probs.design.patterns.uber.payment;

public class Debit implements PaymentMethodStrategy {

	@Override
	public void pay(double amount) throws Exception {
		System.out.println("Successful debit Payment of " + amount);
	}

}
