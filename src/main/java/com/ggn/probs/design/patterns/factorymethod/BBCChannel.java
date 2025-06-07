package com.ggn.probs.design.patterns.factorymethod;

public class BBCChannel implements Channel {

	@Override
	public void playChannelEvents() {
		System.out.println("Play BBC Channel Events");
	}

}
