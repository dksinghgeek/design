package com.ggn.probs.design.patterns.parkinglot.parking;

import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Vehicle;
import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class CarSpot extends Spot {
	public CarSpot(int parkingNo) {
		super(parkingNo, VehicleType.CAR);
	}

	@Override
	public boolean canParkVehicle(Vehicle vehicle) {
		return vehicle.getVehicleType().equals(VehicleType.CAR);
	}

}
