package com.ggn.probs.design.principles.banking;

public class MailNotification implements NotificationService {

	@Override
	public void triggerNotifcation() {
		System.out.println("Send mail");
	}

}
