package com.ggn.probs.design.patterns.parkinglot.entity.payment;

public class Debit implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of " + amount + " is successful using Debit");
	}

}
