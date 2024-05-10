package com.ggn.probs.design.patterns.strategy;

public class PaymentByPaypal implements PaymentStrategy {

	public void pay(double amount) {
		System.out.println("Payment done by PayPal " + amount);

	}

}
