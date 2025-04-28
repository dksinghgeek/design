package com.ggn.probs.design.patterns.command;

public class AirCondition {
	private boolean isOn;
	
	public AirCondition() {
		isOn = false;
	}
	
	public void on() {
		isOn = true;
		
		System.out.println("AC is On !!!" );
	}
	
	public void off() {
		isOn = false;
		
		System.out.println("AC is Off !!!" );
	}
}
