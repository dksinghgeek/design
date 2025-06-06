package com.ggn.probs.design.patterns.uber.managers;

import com.ggn.probs.design.patterns.uber.enums.PaymentMethodType;
import com.ggn.probs.design.patterns.uber.payment.Cash;
import com.ggn.probs.design.patterns.uber.payment.Credit;
import com.ggn.probs.design.patterns.uber.payment.Debit;
import com.ggn.probs.design.patterns.uber.payment.PaymentMethodStrategy;
import com.ggn.probs.design.patterns.uber.payment.UPI;
import com.ggn.probs.design.patterns.uber.payment.Wallet;

public class PaymentManager {
	private static volatile PaymentManager instance = null;

	private PaymentManager() {
		if (instance != null) {
			System.out.println("Only one instance of payment Manager is allowed");
		}
	}

	public static PaymentManager getInstance() {
		if (instance == null) {
			synchronized (PaymentManager.class) {
				if (instance == null) {
					instance = new PaymentManager();
				}
			}
		}

		return instance;
	}

	public PaymentMethodStrategy getPaymentMethod(PaymentMethodType type) {
		if(type == PaymentMethodType.UPI) {
			return new UPI();
		} else if(type == PaymentMethodType.WALLET) {
			return new Wallet();
		} else if(type == PaymentMethodType.CREDIT) {
			return new Credit();
		} else if(type == PaymentMethodType.DEBIT) {
			return new Debit();
		}
		
		return new Cash();
	}

}
