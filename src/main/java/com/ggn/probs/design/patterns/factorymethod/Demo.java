package com.ggn.probs.design.patterns.factorymethod;

public class Demo {

	public static void main(String[] args) {
		ChannelFactoryMethod factoryMethod = new ChannelFactoryMethod();
		Channel channel =  factoryMethod.getChannel(ChannelType.ABC);
		channel.playChannelEvents();
		
	}

}
