package com.ggn.probs.design.patterns.state.vending_machine;

import java.util.ArrayList;
import java.util.List;

public class ItemLane {
	private List<Item> items;
	private int code;
	private boolean isSoldOut;
	private static final int FIRST = 0;
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ItemLane() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public Item removeItem() {
		return items.remove(FIRST);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

}
