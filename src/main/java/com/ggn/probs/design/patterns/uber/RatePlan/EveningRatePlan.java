package com.ggn.probs.design.patterns.uber.RatePlan;

public class EveningRatePlan implements RatePlanStrategy {

	@Override
	public double ratePlan() throws Exception {
		System.out.println("Evening Rate Plan");
		return 1.3;
	}

}
