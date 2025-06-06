package com.ggn.probs.design.patterns.uber.RatePlan;

public class AfternoonRatePlan implements RatePlanStrategy {

	@Override
	public double ratePlan() throws Exception {
		System.out.println("Afternoon Rate Plan");
		return 1.2;
	}

}
