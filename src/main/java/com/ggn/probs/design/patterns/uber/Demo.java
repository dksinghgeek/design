package com.ggn.probs.design.patterns.uber;

import java.util.UUID;

import com.ggn.probs.design.patterns.uber.RatePlan.RatePlanStrategy;
import com.ggn.probs.design.patterns.uber.driver.DriverMatchStrategy;
import com.ggn.probs.design.patterns.uber.entity.Driver;
import com.ggn.probs.design.patterns.uber.entity.RideRequest;
import com.ggn.probs.design.patterns.uber.entity.Rider;
import com.ggn.probs.design.patterns.uber.entity.Trip;
import com.ggn.probs.design.patterns.uber.enums.DriverMatchType;
import com.ggn.probs.design.patterns.uber.enums.PaymentMethodType;
import com.ggn.probs.design.patterns.uber.enums.RatePlanType;
import com.ggn.probs.design.patterns.uber.enums.TripStatus;
import com.ggn.probs.design.patterns.uber.managers.DriverManager;
import com.ggn.probs.design.patterns.uber.managers.PaymentManager;
import com.ggn.probs.design.patterns.uber.managers.RatePlanManager;
import com.ggn.probs.design.patterns.uber.managers.RideManager;
import com.ggn.probs.design.patterns.uber.payment.PaymentMethodStrategy;

public class Demo {

	public static void main(String[] args) {
		Rider rider = new Rider();
		rider.setId(UUID.randomUUID());
		rider.setName("Devid");
		rider.setMobileNo("1234567890");
		rider.setEmail("abc@abc.com");
		rider.setRating("5");
		
		System.out.println("Cab booking initiated by Rider");
		RideManager rideManager = RideManager.getInstance();
		RideRequest rideRequest = rideManager.book("Noida", "Delhi", rider.getId());
		
		Driver driver = null;
		try {
			DriverManager driverManager = DriverManager.getInstance();
			DriverMatchStrategy driverMatch = driverManager.getDriver(DriverMatchType.RATING);
			driver = driverMatch.match(rideRequest);
			
			System.out.println("Driver search complted : " + driver.getName());
			
			
		} catch (Exception e) {
			System.out.println("Error during driver matching");
		}
		
		System.out.println("Trip Created");
		Trip trip = rideManager.createTrip(rideRequest, driver.getId());
		trip.setOtp(1234);
		trip.setTripStatus(TripStatus.IN_PROGRESS);
		System.out.println("Trip in progress");
		
		double rideCost = Double.valueOf(trip.getPrice());
		try {
			RatePlanManager ratePlanManager = RatePlanManager.getInstance();
			RatePlanStrategy ratePlan = ratePlanManager.getRatePlan(RatePlanType.SURGE);
			rideCost = rideCost * ratePlan.ratePlan();
			System.out.println("Ride Cost : " + rideCost);
		} catch (Exception ex) {
			System.out.println("Error calculating Rate Plan");
		}

		try {
			// Uber Payment step
			PaymentManager paymentManager = PaymentManager.getInstance();
			PaymentMethodStrategy paymentMethod = paymentManager.getPaymentMethod(PaymentMethodType.UPI);
			paymentMethod.pay(rideCost);
		} catch (Exception ex) {
			System.out.println("Error processing payment");
		}
		
		trip.setTripStatus(TripStatus.COMPLETED);
		
		System.out.println("Trip completed");

	}

}
