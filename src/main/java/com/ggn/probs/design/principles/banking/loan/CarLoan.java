package com.ggn.probs.design.principles.banking.loan;

public class CarLoan implements Loan {

	@Override
	public void grantLoan() {
		System.out.println("Process Car loan");
	}

}
