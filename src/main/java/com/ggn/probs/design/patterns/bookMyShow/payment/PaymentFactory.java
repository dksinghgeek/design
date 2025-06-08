package com.ggn.probs.design.patterns.bookMyShow.payment;

import com.ggn.probs.design.patterns.bookMyShow.enums.PlaymentType;

public class PaymentFactory {
	public Payment getPayment(PlaymentType type) {
		switch (type) {
		case UPI:
			return new UPI();
		case DEBIT:
			return new Debit();
		case CREDIT:
			return new Credit();

		}

		return new Wallet();
	}
}
