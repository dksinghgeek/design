package com.ggn.probs.design.patterns.template;

public class PayToMarchant extends PaymentFlow {

	@Override
	public void validate() {
		System.out.println("Validate PayToMarchant");

	}

	@Override
	public void debitAmount() {
		System.out.println("debit PayToMarchant");

	}

	@Override
	public void calculateFees() {
		System.out.println("calculate fees PayToMarchant");

	}

	@Override
	public void creditAmount() {
		System.out.println("credit amount PayToMarchant");

	}

}
