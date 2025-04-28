package com.ggn.probs.design.patterns.command;

public class Demo {

	public static void main(String[] args) {
		AirCondition airCondition = new AirCondition();
		Command command = new AirConditionOnCommand(airCondition);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.add(command);
		
		remoteControl.processButton();
		
		remoteControl.undo();
		
	}

}
