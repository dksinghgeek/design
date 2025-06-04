package com.ggn.probs.design.patterns.vendingmachine.vendingstates;

import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.Coin;
import com.ggn.probs.design.patterns.vendingmachine.Item;
import com.ggn.probs.design.patterns.vendingmachine.VendingMachine;

public interface State {
	public void pressButtonForCoinCollection(VendingMachine vendingMachine) throws Exception;

	public void collectCoins(VendingMachine vendingMachine, Coin coin) throws Exception;

	public void pressButtonForProductSelection(VendingMachine vendingMachine) throws Exception;

	public List<Coin> refundFullCoins(VendingMachine vendingMachine) throws Exception;

	public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception;

	public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;

	public int getChange(int returnChnageMoney) throws Exception;
}
