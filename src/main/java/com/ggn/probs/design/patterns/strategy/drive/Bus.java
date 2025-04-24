package com.ggn.probs.design.patterns.strategy.drive;

import com.ggn.probs.design.patterns.strategy.drive.strategy.NormalDrive;

public class Bus extends Vehicle {

	public Bus() {
		super(new NormalDrive());
	}

}
