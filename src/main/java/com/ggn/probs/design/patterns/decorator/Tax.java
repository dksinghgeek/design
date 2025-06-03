package com.ggn.probs.design.patterns.decorator;

public class Tax extends ProductDecorator {
	private Product product = null;
	
	public Tax(Product product) {
		this.product = product;
	}

	@Override
	public double total() {
		return product.total() + 5.0;
	}

}
