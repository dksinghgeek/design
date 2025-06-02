package com.ggn.probs.design.patterns.mediator;

public class Demo {

	public static void main(String[] args) {
		AuctionMediator auctionMediator = new Auction();
		Colleague a = new Bidder("Alex", auctionMediator);
		Colleague b = new Bidder("Devid", auctionMediator);
		
		a.placeBid(100);
	}

}
