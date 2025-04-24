package com.ggn.probs.design.patterns.strategy.payment;

public class PaymentByCreditCard implements PaymentStrategy {

	public void pay(double amount) {
		System.out.println("Payment done by Credit Card " + amount);

	}

}
