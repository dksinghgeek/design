package com.ggn.probs.design.patterns.uber.RatePlan;

public class SurgeRatePlan implements RatePlanStrategy {

	@Override
	public double ratePlan() throws Exception {
		System.out.println("Surge Rate Plan");
		return 1.5;
	}

}
