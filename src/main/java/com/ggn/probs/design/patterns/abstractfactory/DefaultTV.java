package com.ggn.probs.design.patterns.abstractfactory;

public class DefaultTV implements Channel {

	@Override
	public void play() {
		System.out.println("Play Default Channel");
	}

}
