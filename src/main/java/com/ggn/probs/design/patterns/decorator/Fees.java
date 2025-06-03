package com.ggn.probs.design.patterns.decorator;

public class Fees extends ProductDecorator {
	private Product product;
	
	public Fees(Product product) {
		this.product = product;
	}

	@Override
	public double total() {
		return product.total() + 2;
	}

}
