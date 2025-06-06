package com.ggn.probs.design.patterns.decorator;

public class Fees extends ProductDecorator {
	
	public Fees(Product product) {
		super(product);
	}

	@Override
	public double total() {
		return product.total() + 2;
	}

}
