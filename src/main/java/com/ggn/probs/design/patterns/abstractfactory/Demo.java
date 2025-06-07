package com.ggn.probs.design.patterns.abstractfactory;

public class Demo {

	public static void main(String[] args) {
		OperatorFactory op = new OperatorFactory();
		op.getFactory(FactoryType.NEWS).getChannel(ChannelType.INDIATV).play();
	}

}
