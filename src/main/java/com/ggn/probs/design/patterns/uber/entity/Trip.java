package com.ggn.probs.design.patterns.uber.entity;

import java.util.UUID;

import com.ggn.probs.design.patterns.uber.enums.TripStatus;

public class Trip {
	private UUID id;
	private UUID riderId;
	private UUID driverId;
	private String pickupLocation;
	private String dropLocation;
	private String fare;
	private int otp;
	private TripStatus tripStatus;

	public Trip(TripBuilder builder) {
		this.id = builder.id;
		this.riderId = builder.riderId;
		this.driverId = builder.driverId;
		this.pickupLocation = builder.pickupLocation;
		this.dropLocation = builder.dropLocation;
		this.otp = builder.otp;
		this.fare = builder.fare;
		this.tripStatus = builder.tripStatus;
	}
	
	public String getPrice() {
		return fare;
	}
	
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	public void setTripStatus(TripStatus status) {
		this.tripStatus = status;
	}

	public static class TripBuilder {
		private UUID id;
		private UUID riderId;
		private UUID driverId;
		private String pickupLocation;
		private String dropLocation;
		private String fare;
		private int otp;
		private TripStatus tripStatus;

		public TripBuilder id(UUID id) {
			this.id = id;
			return this;
		}

		public TripBuilder riderId(UUID riderId) {
			this.riderId = riderId;
			return this;
		}

		public TripBuilder driverId(UUID driverId) {
			this.driverId = driverId;
			return this;
		}

		public TripBuilder pickupLOcation(String pickupLocation) {
			this.pickupLocation = pickupLocation;
			return this;
		}

		public TripBuilder dropLocation(String dropLocation) {
			this.dropLocation = dropLocation;
			return this;
		}

		public TripBuilder otp(int otp) {
			this.otp = otp;
			return this;
		}

		public TripBuilder tripStatus(TripStatus tripStatus) {
			this.tripStatus = tripStatus;
			return this;
		}
		
		public TripBuilder fare(String fare) {
			this.fare = fare;
			return this;
		}

		public Trip build() {
			return new Trip(this);
		}
	}

}
