package com.ggn.probs.design.principles.banking.loan;

public class PersonalLoan implements Loan {

	@Override
	public void grantLoan() {
		System.out.println("Process Personal Loan");
	}

}
