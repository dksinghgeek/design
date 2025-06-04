package com.ggn.probs.design.patterns.vendingmachine.vendingstates.impl;

import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.Coin;
import com.ggn.probs.design.patterns.vendingmachine.Item;
import com.ggn.probs.design.patterns.vendingmachine.VendingMachine;
import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;

public class DispenseState implements State {
	
	public DispenseState(VendingMachine vendingMachine, int code) throws Exception {
		System.out.println("Dispense the Item");
		dispenseProduct(vendingMachine, code);
	}

	@Override
	public void pressButtonForCoinCollection(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can only dispense the product");
	}

	@Override
	public void collectCoins(VendingMachine vendingMachine, Coin coin) throws Exception {
		throw new Exception("You can only dispense the product");
	}

	@Override
	public void pressButtonForProductSelection(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can only dispense the product");
	}

	@Override
	public List<Coin> refundFullCoins(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You can only dispense the product");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You can only dispense the product");
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		Item item = vendingMachine.getInventory().getItem(code);
		vendingMachine.getInventory().updateInventory(code);
		return item;
	}

	@Override
	public int getChange(int returnChnageMoney) throws Exception {
		throw new Exception("You can only dispense the product");
	}

}
