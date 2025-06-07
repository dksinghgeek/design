package com.ggn.probs.design.patterns.abstractfactory;

public class OperatorFactory {
	public ChannelFactory getFactory(FactoryType type) {
		switch (type) {
		case NEWS:
			return new NewsFactory();
		case PLAYS:
			return new PlayFactory();
		}
		
		return new DefaultFactory();
	}
}
