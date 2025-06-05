package com.ggn.probs.design.patterns.nullObject;

public class Demo {
	
	public void switchOnTV(int channelId) {
		Channel channel = null;
		
		if(channelId != 0) {
			channel = new ChannelImpl();
			channel.showEventGrid(channelId);
			return;
		} 
		
		channel = new DefaultChannelImpl();
		channel.showEventGrid(channelId);
	}

	public static void main(String[] args) {
		Demo op = new Demo();
		op.switchOnTV(10);
		
		System.out.println("Default channel");
		op.switchOnTV(0);

	}

}
