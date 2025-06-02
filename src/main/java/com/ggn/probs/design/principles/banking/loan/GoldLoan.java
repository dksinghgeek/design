package com.ggn.probs.design.principles.banking.loan;

public class GoldLoan implements Loan {

	@Override
	public void grantLoan() {
		System.out.println("Gold Loan");
	}

}
