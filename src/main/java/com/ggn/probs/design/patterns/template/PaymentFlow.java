package com.ggn.probs.design.patterns.template;

public abstract class PaymentFlow {
	public abstract void validate();
	public abstract void debitAmount();
	public abstract void calculateFees();
	public abstract void creditAmount();
	
	public void payment() {
		validate();
		debitAmount();
		calculateFees();
		creditAmount();
	}
}
