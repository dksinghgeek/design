package com.ggn.probs.design.patterns.template;

public class Demo {

	public static void main(String[] args) {
		PaymentFlow payment = new PayToFriend();
		payment.payment();
		
		System.out.println();
		
		payment = new PayToMarchant();
		payment.payment();
	}

}
