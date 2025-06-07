package com.ggn.probs.design.patterns.factorymethod;

public class ChannelFactoryMethod {
	public Channel getChannel(ChannelType type) {
		switch (type) {
		case BBC:
			return new BBCChannel();
		case ABC:
			return new ABCChannel();
		}
		
		return new DeaultChannel();
	}
}
