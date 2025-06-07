package com.ggn.probs.design.patterns.abstractfactory;

public class DefaultFactory implements ChannelFactory {

	@Override
	public Channel getChannel(ChannelType type) {
		return new DefaultTV();
	}

}
