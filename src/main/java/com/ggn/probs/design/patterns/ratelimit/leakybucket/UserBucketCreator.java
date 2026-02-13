package com.ggn.probs.design.patterns.ratelimit.leakybucket;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {
	private Map<Integer, LeakyBucket> bucket = null;
	private static volatile UserBucketCreator instance = null;

	private UserBucketCreator() {
		if (instance == null) {
			this.bucket = new HashMap<>();
		} else {
			System.out.println("Only one instance of User Bucket Creator is allowed");
		}
	}

	public static UserBucketCreator getInstance() {
		if (instance == null) {
			synchronized (UserBucketCreator.class) {
				if (instance == null) {
					instance = new UserBucketCreator();
				}
			}
		}

		return instance;
	}

	public void appAccess(int id) {
		if (!bucket.containsKey(id)) {
			bucket.put(id, new LeakyBucket(10));
		}
		
		if(bucket.get(id).grantAccess()) {
			System.out.println("Able to access !");
		} else {
			System.out.println("Too many requests. Pls try after sometime");
		}
	}
}
