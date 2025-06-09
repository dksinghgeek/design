package com.ggn.probs.design.patterns.parkinglot.entity.vehicle;

import com.ggn.probs.design.patterns.parkinglot.entity.payment.PaymentStrategy;

public class Payment {
	private double amount;
	private PaymentStrategy paymentStrategy;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void pay(double amount) {
		paymentStrategy.pay(amount);
	}

}
