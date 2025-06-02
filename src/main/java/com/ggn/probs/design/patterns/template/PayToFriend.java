package com.ggn.probs.design.patterns.template;

public class PayToFriend extends PaymentFlow {

	@Override
	public void validate() {
		System.out.println("Validate payToFriend");
	}

	@Override
	public void debitAmount() {
		System.out.println("debit amount payToFriend");
	}

	@Override
	public void calculateFees() {
		System.out.println("calculate fee payToFriend");
	}

	@Override
	public void creditAmount() {
		System.out.println("credit amount payToFriend");
	}

}
