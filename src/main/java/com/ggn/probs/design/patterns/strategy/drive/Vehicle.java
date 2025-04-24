package com.ggn.probs.design.patterns.strategy.drive;

import com.ggn.probs.design.patterns.strategy.drive.strategy.DriveStrategy;

public abstract class Vehicle {

	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}

	public void processDrive() {
		driveStrategy.drive();
	}
}
