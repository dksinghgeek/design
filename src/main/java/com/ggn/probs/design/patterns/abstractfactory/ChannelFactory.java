package com.ggn.probs.design.patterns.abstractfactory;

public interface ChannelFactory {
	public Channel getChannel(ChannelType type);
}
