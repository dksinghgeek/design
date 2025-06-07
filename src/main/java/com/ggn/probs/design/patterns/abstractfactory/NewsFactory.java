package com.ggn.probs.design.patterns.abstractfactory;

public class NewsFactory implements ChannelFactory {

	@Override
	public Channel getChannel(ChannelType type) {
		switch (type) {
		case INDIATV:
			return new IndiaTV();
		case REPUBLICTV:
			return new RepublicTV();
		}
		return new DefaultTV();
	}

}
