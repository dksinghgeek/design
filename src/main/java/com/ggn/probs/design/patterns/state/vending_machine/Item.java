package com.ggn.probs.design.patterns.state.vending_machine;

public class Item {
	private ItemType itenType;
	private double price;

	public Item(ItemType itenType, double price) {
		super();
		this.itenType = itenType;
		this.price = price;
	}

	public ItemType getItenType() {
		return itenType;
	}

	public void setItenType(ItemType itenType) {
		this.itenType = itenType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
