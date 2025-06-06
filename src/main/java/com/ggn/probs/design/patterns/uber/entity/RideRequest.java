package com.ggn.probs.design.patterns.uber.entity;

import java.util.UUID;

public class RideRequest {
	private UUID id;
	private UUID riderId;
	private String pikupLocation;
	private String dropLOcation;
	private String fare;
	private String createdAt;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getRiderId() {
		return riderId;
	}

	public void setRiderId(UUID riderId) {
		this.riderId = riderId;
	}

	public String getPikupLocation() {
		return pikupLocation;
	}

	public void setPikupLocation(String pikupLocation) {
		this.pikupLocation = pikupLocation;
	}

	public String getDropLOcation() {
		return dropLOcation;
	}

	public void setDropLOcation(String dropLOcation) {
		this.dropLOcation = dropLOcation;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
