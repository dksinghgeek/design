package com.ggn.probs.design.principles.banking;

import com.ggn.probs.design.principles.banking.loan.Loan;

//Liskov substitution principle
public class LoanServiceImpl implements LoanService {
	private Loan loan = null;

	public LoanServiceImpl(Loan loan) {
		this.loan = loan;
	}

	@Override
	public void processLoan() {
		loan.grantLoan();
	}
}
