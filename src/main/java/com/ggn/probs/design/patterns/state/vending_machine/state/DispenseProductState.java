package com.ggn.probs.design.patterns.state.vending_machine.state;

import com.ggn.probs.design.patterns.state.vending_machine.VendingMachine;

public class DispenseProductState implements State {

	@Override
	public void clickOnToCollectTheMoney(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Operation Not supported");

	}

	@Override
	public void collectMoney(VendingMachine vendingMachine, double money) throws Exception {
		throw new Exception("Operation Not supported");
	}

	@Override
	public void clickOnToSelectTheProduct(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Operation Not supported");
	}

	@Override
	public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
		throw new Exception("Operation Not supported");
	}

	@Override
	public void clickOnToDispenseTheProduct(VendingMachine vendingMachine) throws Exception {
		vendingMachine.dispense();
		vendingMachine.initMoney();
		vendingMachine.initProduct();
		vendingMachine.setState(new IdleState());
	}

	@Override
	public void cancelOrRefund(VendingMachine vendingMachine) throws Exception {
		vendingMachine.returnMoney();
		vendingMachine.initMoney();
		vendingMachine.initProduct();
		vendingMachine.setState(new IdleState());
	}

}
