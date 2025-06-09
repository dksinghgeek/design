package com.ggn.probs.design.patterns.parkinglot.entity.vehicle;

import com.ggn.probs.design.patterns.parkinglot.enums.VehicleType;

public class Vehicle {
	private String regNo;
	protected VehicleType vehicleType;

	public Vehicle(String regNo, VehicleType vehicleType) {
		this.regNo = regNo;
		this.vehicleType = vehicleType;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
