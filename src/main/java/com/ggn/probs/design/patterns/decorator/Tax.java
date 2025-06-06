package com.ggn.probs.design.patterns.decorator;

public class Tax extends ProductDecorator {
	
	public Tax(Product product) {
		super(product);
	}

	@Override
	public double total() {
		return product.total() + 5.0;
	}

}
