package com.ggn.probs.design.patterns.uber.managers;

import com.ggn.probs.design.patterns.uber.driver.DriverMatchStrategy;
import com.ggn.probs.design.patterns.uber.driver.LastTripMatching;
import com.ggn.probs.design.patterns.uber.driver.NearerMatching;
import com.ggn.probs.design.patterns.uber.driver.RatingMatching;
import com.ggn.probs.design.patterns.uber.enums.DriverMatchType;

public class DriverManager {
	private static volatile DriverManager instance = null;

	private DriverManager() {
		if (instance != null) {
			System.out.println("Only one instance of Driver Manager is Allowed");
		}
	}

	public static DriverManager getInstance() {
		if (instance == null) {
			synchronized (DriverManager.class) {
				if (instance == null) {
					instance = new DriverManager();
				}
			}
		}
		return instance;
	}

	public DriverMatchStrategy getDriver(DriverMatchType type) {
		if (type == DriverMatchType.RATING) {
			return new RatingMatching();
		} else if (type == DriverMatchType.LAST_TRIP) {
			return new LastTripMatching();
		}

		return new NearerMatching();
	}
}
