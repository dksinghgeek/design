package com.ggn.probs.design.patterns.state.vending_machine.state;

import com.ggn.probs.design.patterns.state.vending_machine.VendingMachine;

public interface State {
	public void clickOnToCollectTheMoney(VendingMachine vendingMachine) throws Exception;

	public void collectMoney(VendingMachine vendingMachine, double money) throws Exception;

	public void clickOnToSelectTheProduct(VendingMachine vendingMachine) throws Exception;

	public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception;

	public void clickOnToDispenseTheProduct(VendingMachine vendingMachine) throws Exception;

	public void cancelOrRefund(VendingMachine vendingMachine) throws Exception;
}
