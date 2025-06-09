package com.ggn.probs.design.patterns.parkinglot.factories;

import com.ggn.probs.design.patterns.parkinglot.entity.payment.Cash;
import com.ggn.probs.design.patterns.parkinglot.entity.payment.Credit;
import com.ggn.probs.design.patterns.parkinglot.entity.payment.Debit;
import com.ggn.probs.design.patterns.parkinglot.entity.payment.UPI;
import com.ggn.probs.design.patterns.parkinglot.entity.payment.Wallet;
import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Payment;
import com.ggn.probs.design.patterns.parkinglot.enums.PaymentType;

public class PaymentFactory {
	public static void pay(double fee, PaymentType type) {
		Payment payment = null;
		if (type == PaymentType.UPI) {
			payment = new Payment();
			payment.setAmount(fee);
			payment.setPaymentStrategy(new UPI());
		} else if (type == PaymentType.DEBIT) {
			payment = new Payment();
			payment.setAmount(fee);
			payment.setPaymentStrategy(new Debit());
		} else if (type == PaymentType.CREDIT) {
			payment = new Payment();
			payment.setAmount(fee);
			payment.setPaymentStrategy(new Credit());
		} else if (type == PaymentType.DEBIT) {
			payment = new Payment();
			payment.setAmount(fee);
			payment.setPaymentStrategy(new Wallet());
		} else {
			payment = new Payment();
			payment.setAmount(fee);
			payment.setPaymentStrategy(new Cash());
		}

		if (fee > 0) {
			payment.pay(fee);
		} else {
			System.out.println("Invalid fee");
		}

	}
}
