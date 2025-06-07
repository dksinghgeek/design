package com.ggn.probs.design.patterns.factorymethod;

public class ABCChannel implements Channel {

	@Override
	public void playChannelEvents() {
		System.out.println("Play ABC Channel Events");
	}

}
