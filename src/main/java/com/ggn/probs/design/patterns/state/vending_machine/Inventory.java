package com.ggn.probs.design.patterns.state.vending_machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
	private Map<Integer, ItemLane> itemLanes;

	public Inventory(int noOfItemLane) {
		this.itemLanes = new HashMap<Integer, ItemLane>();
		initInventory(noOfItemLane);
	}

	private void initInventory(int noOfItemLane) {

		for (int i = 0; i < noOfItemLane; i++) {
			ItemLane itemLane = new ItemLane();
			itemLane.setSoldOut(false);

			if (i == 0) {
				itemLane.setCode(100);
				itemLane.setItems(addItems(ItemType.PEPSI, 10));
				itemLanes.put(100, itemLane);
			} else if (i == 1) {
				itemLane.setCode(101);
				itemLane.setItems(addItems(ItemType.COCA_COLA, 20));
				itemLanes.put(101, itemLane);
			}
		}

	}

	private List<Item> addItems(ItemType itemType, double price) {
		List<Item> items = new ArrayList<Item>();

		Item item1 = new Item(itemType, price);
		Item item2 = new Item(itemType, price);
		Item item3 = new Item(itemType, price);
		Item item4 = new Item(itemType, price);
		Item item5 = new Item(itemType, price);

		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);

		return items;
	}

	public Item getItem(int productCode) {
		if (itemLanes.containsKey(productCode)) {
			return itemLanes.get(productCode).removeItem();
		}

		return null;
	}
	
	public void addItem(int productCode, Item item) {
		if (itemLanes.containsKey(productCode)) {
			itemLanes.get(productCode).addItem(item);
		}
	}
}
