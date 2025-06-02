package com.ggn.probs.design.principles.banking;

public class SmsNotification implements NotificationService {

	@Override
	public void triggerNotifcation() {
		System.out.println("Send sms");
	}

}
