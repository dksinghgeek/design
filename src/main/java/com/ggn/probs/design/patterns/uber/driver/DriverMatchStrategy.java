package com.ggn.probs.design.patterns.uber.driver;

import com.ggn.probs.design.patterns.uber.entity.Driver;
import com.ggn.probs.design.patterns.uber.entity.RideRequest;

public interface DriverMatchStrategy {
	public Driver match(RideRequest rideRequest) throws Exception;
}
