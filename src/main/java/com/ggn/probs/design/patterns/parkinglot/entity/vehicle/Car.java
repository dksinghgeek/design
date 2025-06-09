package com.ggn.probs.design.patterns.parkinglot.entity.vehicle;

import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class Car extends Vehicle {

	public Car(String regNo) {
		super(regNo, VehicleType.CAR);
	}
}
