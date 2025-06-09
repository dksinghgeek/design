package com.ggn.probs.design.patterns.parkinglot.parking;

import com.ggn.probs.design.patterns.parkinglot.entity.vehicle.Vehicle;
import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public abstract class Spot {
	private int parkingNo;
	private boolean isOccupied;
	private Vehicle vehicle;
	private VehicleType vehicleType;

	public Spot(int parkingNo, VehicleType vehicleType) {
		this.parkingNo = parkingNo;
		this.vehicleType = vehicleType;
		this.isOccupied = false;
	}
	
	public abstract boolean canParkVehicle(Vehicle vehicle);
	
	public void parkVehicle(Vehicle vehicle) {
		if(isOccupied) {
			throw new IllegalStateException("Parking occupied !");
		}
		
		if(!canParkVehicle(vehicle)) {
			throw new IllegalArgumentException("");
		}
		
		this.vehicle = vehicle;
		this.isOccupied = true;
	}
	
	public void vacate() {
		if(!isOccupied) {
			throw new IllegalStateException("Parking is free");
		}
		
		this.vehicle = null;
		this.isOccupied = false;
	}

	public int getParkingNo() {
		return parkingNo;
	}

	public void setParkingNo(int parkingNo) {
		this.parkingNo = parkingNo;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
