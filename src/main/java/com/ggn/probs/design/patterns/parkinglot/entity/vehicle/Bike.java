package com.ggn.probs.design.patterns.parkinglot.entity.vehicle;

import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class Bike extends Vehicle {

	public Bike(String regNo) {
		super(regNo, VehicleType.BIKE);
	}
}
