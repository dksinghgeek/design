package com.ggn.probs.design.patterns.parkinglot.parking;

import java.util.ArrayList;
import java.util.List;

import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class Floor {
	private List<Spot> spots;
	private int floor;

	public Floor(int floor, int noOfCars, int noOfBikes) {
		this.floor = floor;
		this.spots = new ArrayList<>();

		for (int i = 0; i < noOfCars; i++) {
			this.spots.add(new CarSpot(i+1));
		}
		
		for(int i = noOfCars; i < noOfCars + noOfBikes; i++) {
			this.spots.add(new BikeSpot(i+1));
		}
	}
	
	public Spot findAvailability(VehicleType type) {
		for(Spot s : spots) {
			if(!s.isOccupied() && s.getVehicleType().equals(type)) {
				return s;
			}
		}
		
		return null;
	}
}
