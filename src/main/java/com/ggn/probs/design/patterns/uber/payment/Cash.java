package com.ggn.probs.design.patterns.uber.payment;

public class Cash implements PaymentMethodStrategy {

	@Override
	public void pay(double amount) throws Exception {
		System.out.println("Please pay cash of amount "+ amount+ " directly to driver");
	}

}
