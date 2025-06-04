package com.ggn.probs.design.patterns.ecom;

public class Demo {

	public static void main(String[] args) {
		CartRepository repo = new CartRepository();
		CheckoutManager checkoutManager = new CheckoutManager(repo);
		CartManager cart = new CartManager(checkoutManager);
		
		System.out.println("Select Product");
		Product product = selectProducts();
		
		System.out.println("Select quantity");
		CartItem item = new CartItem();
		
		item.setProduct(product);
		item.setQuantity(2);
		
		System.out.println("Add product in cart");
		cart.add(item);
		
		repo.add(cart.getCartId(), cart);

		
		System.out.println("Initiate checkout");
		Checkout checkout = new Checkout(cart.getCartId());
		double total =  cart.initiateCheckout(checkout);
		
		checkout.setCheckoutStatus(CheckoutStatus.COMPLETED);
		
		System.out.println("Initiate Payment");
		PaymentManager paymentManager = new PaymentManager();
		paymentManager.pay(total);
	}
	
	public static Product selectProducts() {
		Product product = new Product();
		product.setName("IPhone");
		product.setProductType(ProductType.ELECTORNIC);
		product.setPrice(1000.00);
		product.setDescription("Phone");
		
		return product;
	}

}
