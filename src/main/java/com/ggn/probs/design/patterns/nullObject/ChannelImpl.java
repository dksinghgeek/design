package com.ggn.probs.design.patterns.nullObject;

public class ChannelImpl implements Channel{

	@Override
	public void showEventGrid(int channelId) {
		System.out.println("Loading Events Grid for " + channelId);
	}

}
