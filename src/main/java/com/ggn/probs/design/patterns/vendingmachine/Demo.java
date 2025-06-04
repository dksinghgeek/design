package com.ggn.probs.design.patterns.vendingmachine;

import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;

public class Demo {

	public static void main(String[] args) {
		try {
			VendingMachine machine = new VendingMachine();

			fillUpInventory(machine);
			displayInventory(machine);

			State vendingMachineState = machine.getVendingMachineState();
			
			vendingMachineState.pressButtonForCoinCollection(machine);

			System.out.println("Enter coins...");
			vendingMachineState = machine.getVendingMachineState();
			vendingMachineState.collectCoins(machine, Coin.NICKEL);
			vendingMachineState.collectCoins(machine, Coin.QUATER);
			
			System.out.println("Press Product selection button");
			vendingMachineState.pressButtonForProductSelection(machine);
			
			System.out.println("Selction Item");
			vendingMachineState = machine.getVendingMachineState();
			vendingMachineState.chooseProduct(machine, 102);
			
			displayInventory(machine);
			
			
		} catch (Exception ex) {
			System.out.println("Error while operating Vending Machine" + ex);
		}
	}

	private static void displayInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.getInventory().getInventory();

		System.out.println("Display Items in Vending Machine");

		for (int i = 0; i < slots.length; i++) {
			System.out.println("Item Code : " + slots[i].getCode() + " Item Type : " + slots[i].getItem().getItemType()
					+ " Item Price : " + slots[i].getItem().getPrice() + " Sold out : " + slots[i].isSoldOut());
		}
	}

	private static void fillUpInventory(VendingMachine vendingMachine) {
		ItemShelf[] slots = vendingMachine.getInventory().getInventory();
		for (int i = 0; i < slots.length; i++) {
			Item newitem = new Item();
			if (i >= 0 && i < 3) {
				newitem.setItemType(ItemType.COKE);
				newitem.setPrice(10);
			} else if (i >= 3 && i < 7) {
				newitem.setItemType(ItemType.PEPSI);
				newitem.setPrice(17);
			} else {
				newitem.setItemType(ItemType.SODA);
				newitem.setPrice(15);

			}
			slots[i].setItem(newitem);
			slots[i].setSoldOut(false);
		}
	}

}
