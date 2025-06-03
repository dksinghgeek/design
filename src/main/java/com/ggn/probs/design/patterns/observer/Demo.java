package com.ggn.probs.design.patterns.observer;

public class Demo {

	//Notify Me Functionality
	public static void main(String[] args) {
		StockObserable observable = new IPhoneStockObserableImpl();
		NotificationAlertObserver email = new EmailAlertObserverImpl("abc@gmail.com", observable);
		NotificationAlertObserver sms = new SmsAlertObserver(1234567890, observable);
		
		observable.add(email);
		observable.add(sms);
		
		observable.setStockCount(10);
	}

}
