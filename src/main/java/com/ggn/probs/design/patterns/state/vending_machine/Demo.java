package com.ggn.probs.design.patterns.state.vending_machine;

import com.ggn.probs.design.patterns.state.vending_machine.state.IdleState;
import com.ggn.probs.design.patterns.state.vending_machine.state.State;

public class Demo {

	public static void main(String[] args) {
		Inventory inventory = new Inventory(2);
		VendingMachine vendingMachine = new VendingMachine(inventory);

		try {

			State state = new IdleState();
			state.clickOnToCollectTheMoney(vendingMachine);
			
			state = vendingMachine.getState();
			state.collectMoney(vendingMachine, 50);
			state.clickOnToSelectTheProduct(vendingMachine);
			
			state = vendingMachine.getState();
			state.selectProduct(vendingMachine, 100);
			
			state = vendingMachine.getState();
			state.clickOnToDispenseTheProduct(vendingMachine);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
