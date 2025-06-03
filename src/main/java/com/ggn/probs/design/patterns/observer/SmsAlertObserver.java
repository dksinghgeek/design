package com.ggn.probs.design.patterns.observer;

public class SmsAlertObserver implements NotificationAlertObserver {
	private StockObserable observable = null;
	private long mobileNo;

	public SmsAlertObserver(long mobileNo, StockObserable obserable) {
		this.mobileNo = mobileNo;
		this.observable = obserable;
	}

	@Override
	public void update() {
		sendSms(mobileNo, observable.getStockCount());
	}

	public void sendSms(long mobileNo, int stock) {
		System.out.println("IPhone stock is available and sms sent to : " + mobileNo);
	}

}
