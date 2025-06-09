package com.ggn.probs.design.patterns.parkinglot;

import java.util.ArrayList;
import java.util.List;

import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Vehicle;
import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;
import com.ggn.probs.design.patterns.parkinglot.parking.Floor;
import com.ggn.probs.design.patterns.parkinglot.parking.Spot;

public class ParkingLot {
	private static volatile ParkingLot instance = null;
	private List<Floor> floors;

	private ParkingLot() {
		if (instance != null) {
			System.out.println("Only one ParkingLot instance aloowed");
		} else {
			floors = new ArrayList<>();
			floors.add(new Floor(1, 2, 2));
			floors.add(new Floor(2, 2, 2));
		}
	}

	public static ParkingLot getInstance() {
		if (instance == null) {
			synchronized (ParkingLot.class) {
				if (instance == null) {
					instance = new ParkingLot();
				}
			}
		}

		return instance;
	}
	
	public Spot findAvailableSpot(VehicleType type) {
		for(Floor f : floors) {
			return f.findAvailability(type);
		}
		
		return null;
	}
	
	public void parkVehicle(Spot spot, Vehicle vehicle) {
		spot.parkVehicle(vehicle);
		System.out.println("Vehicle parked at " + spot.getParkingNo());
	}
	
	public void vacateParking(Spot spot, Vehicle vehicle) {
		if(spot.isOccupied() && spot.getVehicleType().equals(vehicle.getVehicleType())) {
			spot.vacate();
			System.out.println("Parking free from " + spot.getParkingNo());
		} else {
			System.out.println("Invalid spot to vacate");
		}
	}

}
