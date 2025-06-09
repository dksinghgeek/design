package com.ggn.probs.design.patterns.parkinglot.factories;

import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Bike;
import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Car;
import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Vehicle;
import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class VehicleFactory {
	public static Vehicle getVehicle(VehicleType type, String regNo) {
		if(type == VehicleType.CAR) {
			return new Car(regNo);
		} else if(type == VehicleType.BIKE) {
			return new Bike(regNo);
		}
		
		return null;
	}
}
