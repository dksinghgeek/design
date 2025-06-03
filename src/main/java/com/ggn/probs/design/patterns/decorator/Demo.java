package com.ggn.probs.design.patterns.decorator;

public class Demo {

	public static void main(String[] args) {
		Product product = new Cloth();
		product = new Fees(product);
		product = new Tax(product);
		
		System.out.println("Total : " + product.total());
	}

}
