package com.ggn.probs.design.patterns.ecom;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CartManager {
	private UUID id;
	private List<CartItem> items;
	private CheckoutManager checkoutManager;
	
	public CartManager(CheckoutManager checkoutManager) {
		this.id = UUID.randomUUID();
		this.items = new ArrayList<>();
		this.checkoutManager = checkoutManager;
	}
	
	public void add(CartItem item) {
		this.items.add(item);
	}
	
	public void remove(CartItem item) {
		this.items.remove(item);
	}
	
	public double total() {
		double total = 0.0;
		for(CartItem item : items) {
			total += item.totalProductPrice();
		}
		
		return total;
	}
	
	public UUID getCartId() {
		return id;
	}

	public double  initiateCheckout(Checkout checkout) {
		return checkoutManager.processCheckout(checkout);
	}
}
