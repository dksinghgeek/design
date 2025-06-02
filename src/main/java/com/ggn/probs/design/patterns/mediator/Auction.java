package com.ggn.probs.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
	private List<Colleague> bidders = null;
	
	public Auction() {
		this.bidders = new ArrayList<>();
	}

	@Override
	public void addBidder(Colleague bidder) {
		bidders.add(bidder);
	}

	@Override
	public void placeBid(Colleague bidder, double bid) {
		bidders.stream().filter(a -> ! bidder.getName().equals(a.getName())).forEach(s -> s.sentBidMessage(bidder.getName(), bid));
	}

}
