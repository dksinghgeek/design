package com.ggn.probs.design.patterns.strategy.drive;

import com.ggn.probs.design.patterns.strategy.drive.strategy.RaceDrive;

public class SportCar extends Vehicle {

	public SportCar() {
		super(new RaceDrive());
	}

}
