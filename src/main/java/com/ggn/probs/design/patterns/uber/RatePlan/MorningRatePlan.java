package com.ggn.probs.design.patterns.uber.RatePlan;

public class MorningRatePlan implements RatePlanStrategy {

	@Override
	public double ratePlan() throws Exception {
		System.out.println("Morning Rate Plan");
		return 1.1;
	}

}
