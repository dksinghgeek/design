package com.ggn.probs.design.patterns.ratelimit;

import java.util.concurrent.locks.ReentrantLock;

public class TokenBucketRateLimiter implements RateLimiter {
	private final long capacity;
	private final long refillRate;

	private double tokens;
	private long lastRefillTime;

	private ReentrantLock lock = new ReentrantLock();

	public TokenBucketRateLimiter(long capacity, int refillRate) {
		this.capacity = capacity;
		this.refillRate = refillRate;

		this.tokens = capacity;
		this.lastRefillTime = System.nanoTime();
	}

	@Override
	public boolean tryAcquire() {
		lock.lock();
		try {
			refill();

			if (tokens >= 1) {
				tokens -= 1;
				return true;
			}
			return false;

		} finally {
			lock.unlock();
		}

	}

	private void refill() {
		long now = System.nanoTime();
		double seconds = (now - lastRefillTime) / 1_000_000_000.0;

		double tokenToAdded = seconds * refillRate;

		if (tokenToAdded > 0) {
			tokens = Math.min(capacity, tokens + tokenToAdded);
			this.lastRefillTime = now;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RateLimiter tokenBuket = new TokenBucketRateLimiter(5, 2);

		for (int i = 0; i < 10; i++) {
			if (tokenBuket.tryAcquire()) {
				System.out.println("Successful");
			} else {
				System.out.println("Failed");
				Thread.sleep(1000);
			}
		}
	}

}
