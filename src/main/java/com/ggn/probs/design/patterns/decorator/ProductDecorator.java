package com.ggn.probs.design.patterns.decorator;

public abstract class ProductDecorator extends Product{
	protected Product product;
	
	public ProductDecorator(Product product) {
		this.product = product;
	}
}
