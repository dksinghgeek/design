package com.ggn.probs.design.patterns.state.vending_machine.state;

import com.ggn.probs.design.patterns.state.vending_machine.VendingMachine;

public class CollectMoneyState implements State {

	@Override
	public void clickOnToCollectTheMoney(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Operation Not supported");

	}

	@Override
	public void collectMoney(VendingMachine vendingMachine, double money) throws Exception {
		vendingMachine.addMoney(money);

	}

	@Override
	public void clickOnToSelectTheProduct(VendingMachine vendingMachine) throws Exception {
		vendingMachine.setState(new SelectProductState());

	}

	@Override
	public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
		throw new Exception("Operation Not supported");

	}

	@Override
	public void clickOnToDispenseTheProduct(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Operation Not supported");

	}

	@Override
	public void cancelOrRefund(VendingMachine vendingMachine) throws Exception {
		vendingMachine.returnMoney();
		vendingMachine.setState(new IdleState());
	}

}
