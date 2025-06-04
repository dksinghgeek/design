package com.ggn.probs.design.patterns.ecom;

import java.util.UUID;

public class Product {
	private UUID id;
	private ProductType productType;
	private double price;
	private String name;
	private String Description;

	public Product() {
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
