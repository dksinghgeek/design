package com.ggn.probs.design.patterns.factorymethod;

public class DeaultChannel implements Channel {

	@Override
	public void playChannelEvents() {
		System.out.println("Play Default channel Events");
	}

}
