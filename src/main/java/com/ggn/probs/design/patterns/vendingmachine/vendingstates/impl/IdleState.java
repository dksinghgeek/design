package com.ggn.probs.design.patterns.vendingmachine.vendingstates.impl;

import java.util.ArrayList;
import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.Coin;
import com.ggn.probs.design.patterns.vendingmachine.Item;
import com.ggn.probs.design.patterns.vendingmachine.VendingMachine;
import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;

public class IdleState implements State {

	public IdleState() {
		System.out.println("Vending Machine is in Idle state");
	}

	public IdleState(VendingMachine vendingMachine) {
		System.out.println("Vending Machine is in Idle state");
		vendingMachine.setCoins(new ArrayList<>());
	}

	@Override
	public void pressButtonForCoinCollection(VendingMachine vendingMachine) throws Exception {
		System.out.println("User Pressed coin collection button");
		vendingMachine.setVendingMachineState(new CollectCoinsState());
	}

	@Override
	public void collectCoins(VendingMachine vendingMachine, Coin coin) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

	@Override
	public void pressButtonForProductSelection(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

	@Override
	public List<Coin> refundFullCoins(VendingMachine vendingMachine) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

	@Override
	public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

	@Override
	public int getChange(int returnChnageMoney) throws Exception {
		throw new Exception("You need to press coin collection first");
	}

}
