package com.ggn.probs.design.patterns.bookMyShow.managers;

import com.ggn.probs.design.patterns.bookMyShow.payment.Payment;

public class PaymentManager {
	public static volatile PaymentManager instance;
	private Payment payment;

	private PaymentManager() {
		if (instance != null) {
			System.out.println("Only one instance of Payment Manager is allowed");
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
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public boolean pay(double amount) {
		return payment.pay(amount);
	}
}
