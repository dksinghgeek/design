package com.ggn.probs.design.patterns.mediator;

public interface Colleague {
	public void placeBid(double bid);

	public void sentBidMessage(String bidder, double bid);

	public String getName();
}
