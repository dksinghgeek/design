package com.ggn.probs.design.patterns.vendingmachine.vendingstates.impl;

import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.Coin;
import com.ggn.probs.design.patterns.vendingmachine.Item;
import com.ggn.probs.design.patterns.vendingmachine.VendingMachine;
import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;

public class ProductSelectionState implements State {

	@Override
	public void pressButtonForCoinCollection(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You need to select product");
	}

	@Override
	public void collectCoins(VendingMachine vendingMachine, Coin coin) throws Exception {
		throw new Exception("You need to select product");
	}

	@Override
	public void pressButtonForProductSelection(VendingMachine vendingMachine) throws Exception {
		return;
	}

	@Override
	public List<Coin> refundFullCoins(VendingMachine vendingMachine) throws Exception {
		System.out.println("Full refund Accepted");
		vendingMachine.setVendingMachineState(new IdleState());
		return vendingMachine.getCoins();
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
		Item  item = vendingMachine.getInventory().getItem(code);
		
		if(item == null) {
			throw new Exception("Item not available. Please select right code");
		}
		
		int paidByUser = 0;
		for(Coin coin : vendingMachine.getCoins()) {
			paidByUser += coin.value;
		}
		
		if(paidByUser < item.getPrice()) {
			System.out.println("Insufficient coins by user");
			refundFullCoins(vendingMachine);
			throw new Exception("Insufficient funds by user");
		} else if(paidByUser >= item.getPrice()) {
			if(paidByUser > item.getPrice()) {
				getChange(paidByUser - item.getPrice());
			}
			
			vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, code));
		}
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You need to select product");
	}

	@Override
	public int getChange(int returnChnageMoney) throws Exception {
		System.out.println("Return extra coins to user : " + returnChnageMoney);
		return returnChnageMoney;
	}

}
