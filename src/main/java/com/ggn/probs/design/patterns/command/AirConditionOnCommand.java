package com.ggn.probs.design.patterns.command;

public class AirConditionOnCommand implements Command {
	private AirCondition airCondition;
	
	public AirConditionOnCommand(AirCondition airCondition) {
		this.airCondition = airCondition;
	}

	@Override
	public void execute() {
		airCondition.on();
	}

	@Override
	public void undo() {
		airCondition.off();
	}

}
