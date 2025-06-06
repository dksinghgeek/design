package com.ggn.probs.design.patterns.uber.managers;

import com.ggn.probs.design.patterns.uber.RatePlan.AfternoonRatePlan;
import com.ggn.probs.design.patterns.uber.RatePlan.BasicRatePlan;
import com.ggn.probs.design.patterns.uber.RatePlan.EveningRatePlan;
import com.ggn.probs.design.patterns.uber.RatePlan.MorningRatePlan;
import com.ggn.probs.design.patterns.uber.RatePlan.RatePlanStrategy;
import com.ggn.probs.design.patterns.uber.RatePlan.SurgeRatePlan;
import com.ggn.probs.design.patterns.uber.enums.RatePlanType;

public class RatePlanManager {
	private static volatile RatePlanManager instance = null;

	private RatePlanManager() {
		if (instance != null) {
			System.out.println("Only one instance Rate Plan Manager is allowed");
		}
	}

	public static RatePlanManager getInstance() {
		if (instance == null) {
			synchronized (RatePlanManager.class) {
				if (instance == null) {
					instance = new RatePlanManager();
				}
			}
		}

		return instance;
	}

	public RatePlanStrategy getRatePlan(RatePlanType type) {
		if (type == RatePlanType.MORNING) {
			return new MorningRatePlan();
		} else if (type == RatePlanType.AFTERNOON) {
			return new AfternoonRatePlan();
		} else if (type == RatePlanType.EVENING) {
			return new EveningRatePlan();
		} else if (type == RatePlanType.SURGE) {
			return new SurgeRatePlan();
		}
		
		return new BasicRatePlan();
	}
}
