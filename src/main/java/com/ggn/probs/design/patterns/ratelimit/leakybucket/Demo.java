package com.ggn.probs.design.patterns.ratelimit.leakybucket;

public class Demo {

	public static void main(String[] args) {
		UserBucketCreator instance = UserBucketCreator.getInstance();

		for (int i = 0; i < 12; i++) {
			instance.appAccess(1);
		}
	}

}
