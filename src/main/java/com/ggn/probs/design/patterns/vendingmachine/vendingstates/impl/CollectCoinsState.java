package com.ggn.probs.design.patterns.vendingmachine.vendingstates.impl;

import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.Coin;
import com.ggn.probs.design.patterns.vendingmachine.Item;
import com.ggn.probs.design.patterns.vendingmachine.VendingMachine;
import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;

public class CollectCoinsState implements State {

	@Override
	public void pressButtonForCoinCollection(VendingMachine vendingMachine) throws Exception {
		return;
	}

	@Override
	public void collectCoins(VendingMachine vendingMachine, Coin coin) throws Exception {
		System.out.println("Coin Accepted");
		vendingMachine.getCoins().add(coin);
	}

	@Override
	public void pressButtonForProductSelection(VendingMachine vendingMachine) throws Exception {
		vendingMachine.setVendingMachineState(new ProductSelectionState());
	}

	@Override
	public List<Coin> refundFullCoins(VendingMachine vendingMachine) throws Exception {
		System.out.println("Full refund Accepted");
		vendingMachine.setVendingMachineState(new IdleState());
		return vendingMachine.getCoins();
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You need to add coin");
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You need to add coin");
	}

	@Override
	public int getChange(int returnChnageMoney) throws Exception {
		throw new Exception("You need to add coin");
	}

}
