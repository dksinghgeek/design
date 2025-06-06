package com.ggn.probs.design.patterns.uber.payment;

public interface PaymentMethodStrategy {
	public void pay(double amount) throws Exception;
}
