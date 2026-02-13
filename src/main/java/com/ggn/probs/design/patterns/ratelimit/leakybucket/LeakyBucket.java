package com.ggn.probs.design.patterns.ratelimit.leakybucket;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class LeakyBucket implements RateLimiter {
	private BlockingDeque<Integer> queue;
	
	public LeakyBucket(int capacity) {
		this.queue = new LinkedBlockingDeque<>(capacity);
	}

	@Override
	public boolean grantAccess() {
		if(queue.remainingCapacity() > 0) {
			queue.add(1);
			return true;
		}
		return false;
	}

}
