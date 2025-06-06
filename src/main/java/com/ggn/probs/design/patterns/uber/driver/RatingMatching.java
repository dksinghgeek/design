package com.ggn.probs.design.patterns.uber.driver;

import java.util.UUID;

import com.ggn.probs.design.patterns.uber.entity.Driver;
import com.ggn.probs.design.patterns.uber.entity.RideRequest;

public class RatingMatching implements DriverMatchStrategy {

	@Override
	public Driver match(RideRequest rideRequest) throws Exception {
		Driver driver = new Driver();
		driver.setId(UUID.randomUUID());
		driver.setName("Alex");
		driver.setCarRegNo("1111AC2222");
		driver.setMobileNo("1234567890");
		driver.setRating("5");
		return driver;
	}

}
