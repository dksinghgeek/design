package com.ggn.probs.design.patterns.uber.payment;

public class UPI implements PaymentMethodStrategy {

	@Override
	public void pay(double amount) throws Exception {
		System.out.println("Successful UPI Payment of " + amount);
	}

}
