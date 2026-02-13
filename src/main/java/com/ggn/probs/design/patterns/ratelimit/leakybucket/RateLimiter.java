package com.ggn.probs.design.patterns.ratelimit.leakybucket;

public interface RateLimiter {
	public boolean grantAccess();
}
