package com.ggn.probs.design.patterns.state.vending_machine.state;

import com.ggn.probs.design.patterns.state.vending_machine.Item;
import com.ggn.probs.design.patterns.state.vending_machine.VendingMachine;

public class SelectProductState implements State {

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
		Item item = vendingMachine.selectProduct(productCode);
		
		if(item == null)
			System.out.println("Invalid product code");
		
		if(vendingMachine.getMoney() < item.getPrice()) {
			System.out.println("Insufficient Money!!");
			vendingMachine.initMoney();
			vendingMachine.initProduct();
			vendingMachine.setState(new IdleState());
		} else {
			if(vendingMachine.getMoney() - item.getPrice() > 0) {
				System.out.println("Refund Money : " + (vendingMachine.getMoney() - item.getPrice()));
			}
			
			vendingMachine.setState(new DispenseProductState());
		}
	}

	@Override
	public void clickOnToDispenseTheProduct(VendingMachine vendingMachine) throws Exception {
		throw new Exception("Operation Not supported");
	}

	@Override
	public void cancelOrRefund(VendingMachine vendingMachine) throws Exception {
		vendingMachine.returnMoney();
		vendingMachine.initMoney();
		vendingMachine.initProduct();
		vendingMachine.setState(new IdleState());
	}

}
