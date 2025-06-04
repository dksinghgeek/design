package com.ggn.probs.design.patterns.ecom;

import java.util.UUID;

public class Checkout {
	private UUID id;
	private UUID cartId;
	private CheckoutStatus checkoutStatus;

	public Checkout(UUID cartId) {
		this.cartId = cartId;
		this.id = UUID.randomUUID();
		this.checkoutStatus = CheckoutStatus.NOT_STARTED;
	}

	public CheckoutStatus getCheckoutStatus() {
		return checkoutStatus;
	}

	public void setCheckoutStatus(CheckoutStatus checkoutStatus) {
		this.checkoutStatus = checkoutStatus;
	}
	
	public UUID getCartId() {
		return cartId;
	}

}
