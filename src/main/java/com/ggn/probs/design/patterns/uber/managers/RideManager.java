package com.ggn.probs.design.patterns.uber.managers;

import java.util.UUID;

import com.ggn.probs.design.patterns.uber.entity.RideRequest;
import com.ggn.probs.design.patterns.uber.entity.Trip;
import com.ggn.probs.design.patterns.uber.enums.TripStatus;

public class RideManager {
	private static RideManager instance = null;

	private RideManager() {
		if (instance != null) {
			System.out.println("Only one instance of Ride Manager Allowed");
		}
	}

	public static RideManager getInstance() {
		if (instance == null) {
			synchronized (RideManager.class) {
				if (instance == null) {
					instance = new RideManager();
				}
			}
		}

		return instance;
	}

	public RideRequest book(String pickupLocation, String dropLocation, UUID riderId) {
		RideRequest rideRequest = new RideRequest();
		rideRequest.setId(UUID.randomUUID());
		rideRequest.setRiderId(riderId);
		rideRequest.setPikupLocation(pickupLocation);
		rideRequest.setDropLOcation(dropLocation);
		rideRequest.setFare("100.00"); // Calculation based on distance etc.

		return rideRequest;
	}

	public Trip createTrip(RideRequest rideRequest, UUID driverId) {
		Trip.TripBuilder builder = new Trip.TripBuilder();
		builder.id(UUID.randomUUID()).driverId(driverId).riderId(rideRequest.getRiderId())
				.pickupLOcation(rideRequest.getPikupLocation()).dropLocation(rideRequest.getDropLOcation())
				.fare(rideRequest.getFare()).tripStatus(TripStatus.NOT_STARTED);

		return builder.build();
	}

}
