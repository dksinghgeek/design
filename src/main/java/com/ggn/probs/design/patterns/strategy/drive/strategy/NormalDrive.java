package com.ggn.probs.design.patterns.strategy.drive.strategy;

public class NormalDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println(" Normal Drive");
	}

}
