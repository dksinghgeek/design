package com.ggn.probs.design.patterns.abstractfactory;

public class PlayFactory implements ChannelFactory {

	@Override
	public Channel getChannel(ChannelType type) {
		switch (type) {
		case STARPLUSTV:
			return new StarPlusTV();
		case COLORTV:
			return new ColorTV();
		}
		return new DefaultTV();
	}

}
