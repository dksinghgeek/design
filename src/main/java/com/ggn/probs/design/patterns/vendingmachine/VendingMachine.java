package com.ggn.probs.design.patterns.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.ggn.probs.design.patterns.vendingmachine.vendingstates.State;
import com.ggn.probs.design.patterns.vendingmachine.vendingstates.impl.IdleState;

public class VendingMachine {
	private Inventory inventory;
	private State vendingMachineState;
	private List<Coin> coins;

	public VendingMachine() {
		this.inventory = new Inventory(10);
		this.vendingMachineState = new IdleState();
		coins = new ArrayList<>();
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public State getVendingMachineState() {
		return vendingMachineState;
	}

	public void setVendingMachineState(State vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}

}
