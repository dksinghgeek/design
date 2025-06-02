package com.ggn.probs.design.patterns.mediator;

public class Bidder implements Colleague {
	private AuctionMediator auctionMediator = null;
	private String name;

	public Bidder(String name, AuctionMediator auctionMediator) {
		this.name = name;
		this.auctionMediator = auctionMediator;
		this.auctionMediator.addBidder(this);
	}

	@Override
	public void placeBid(double bid) {
		auctionMediator.placeBid(this, bid);
	}

	@Override
	public void sentBidMessage(String bidder, double bid) {
		System.out.println("Bidder : " + bidder + " placed bid of : " + bid);
	}

	public String getName() {
		return name;
	}

}
