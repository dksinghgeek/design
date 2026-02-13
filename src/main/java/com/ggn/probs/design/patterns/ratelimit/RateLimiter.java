package com.ggn.probs.design.patterns.ratelimit;

public interface RateLimiter {
	public boolean tryAcquire();
}
