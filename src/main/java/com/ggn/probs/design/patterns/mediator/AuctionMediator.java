package com.ggn.probs.design.patterns.mediator;

public interface AuctionMediator {
	public void addBidder(Colleague bidder);

	public void placeBid(Colleague bidder, double bid);

}
