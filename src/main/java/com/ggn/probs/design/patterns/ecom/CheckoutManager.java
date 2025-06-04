package com.ggn.probs.design.patterns.ecom;

public class CheckoutManager {
	private CartRepository cartRepository;

	public CheckoutManager(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}

	public double processCheckout(Checkout checkout) {
		checkout.setCheckoutStatus(CheckoutStatus.IN_PROGRESS);
		
		System.out.println("Checkout Status : " + checkout.getCheckoutStatus());

		return cartRepository.get(checkout.getCartId()).total();
	}

}
