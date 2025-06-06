package com.ggn.probs.design.patterns.uber.RatePlan;

public class BasicRatePlan implements RatePlanStrategy {

	@Override
	public double ratePlan() throws Exception {
		System.out.println("Basic Rate Plan");
		return 1.0;
	}

}
