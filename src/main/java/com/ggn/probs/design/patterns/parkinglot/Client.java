package com.ggn.probs.design.patterns.parkinglot;

import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Bike;
import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Car;
import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Vehicle;
import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;
import com.ggn.probs.design.patterns.parkinglot.parking.Spot;

public class Client {

	public static void main(String[] args) {
		ParkingLot instance = ParkingLot.getInstance();
		Vehicle car = new Car("1");
		
		Spot spot = instance.findAvailableSpot(VehicleType.CAR);
		if(spot != null) {
			instance.parkVehicle(spot, car);
		}
		
		instance.vacateParking(spot, car);
		
		Vehicle c = new Bike("2");
		instance.vacateParking(spot, c);
	}

}
