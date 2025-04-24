package com.ggn.probs.design.patterns.state.vending_machine;

import com.ggn.probs.design.patterns.state.vending_machine.state.IdleState;
import com.ggn.probs.design.patterns.state.vending_machine.state.State;

public class VendingMachine {
	private Inventory inventory;
	private State state;
	private double money;
	private Item item;
	private int productCode;

	public VendingMachine(Inventory inventory) {
		this.inventory = inventory;
		this.state = new IdleState();
		this.money = 0.0;
		this.productCode = 0;
	}

	public Double getMoney() {
		return money;
	}

	public void addMoney(double money) {
		double sum = this.getMoney() + money;
		this.money = sum;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Item selectProduct(int productCode) {
		this.productCode = productCode;
		item = inventory.getItem(productCode);
		return item;
	}

	public void initMoney() {
		money = 0.0;
	}

	public void initProduct() {
		inventory.addItem(productCode, item);
	}

	public void dispense() {
		System.out.println("Dispense item : " + item);

	}

	public void returnMoney() {
		System.out.println("Please collect your money : " + money);
		
	}

}
