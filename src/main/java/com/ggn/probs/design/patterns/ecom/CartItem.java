package com.ggn.probs.design.patterns.ecom;

import java.util.UUID;

public class CartItem {
	private UUID id;
	private Product product;
	private int quantity;

	public CartItem() {
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalProductPrice() {
		return quantity * product.getPrice();
	}
}
