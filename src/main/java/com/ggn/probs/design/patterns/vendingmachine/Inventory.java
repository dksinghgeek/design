package com.ggn.probs.design.patterns.vendingmachine;

public class Inventory {
	private ItemShelf[] inventory;

	public Inventory(int itemCount) {
		inventory = new ItemShelf[itemCount];
		initializedEmptyInventory();
	}

	public ItemShelf[] getInventory() {
		return inventory;
	}

	public void setInventory(ItemShelf[] inventory) {
		this.inventory = inventory;
	}

	private void initializedEmptyInventory() {
		int code = 101;

		for (int i = 0; i < inventory.length; i++) {
			ItemShelf space = new ItemShelf();
			space.setCode(code);
			space.setSoldOut(true);
			inventory[i] = space;
			code++;
		}
	}

	public Item getItem(int code) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i].getCode() == code) {
				return inventory[i].getItem();
			}
		}

		return null;
	}

	public void updateInventory(int code) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i].getCode() == code) {
				inventory[i].setSoldOut(true);
			}
		}

	}

}
