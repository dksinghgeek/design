package com.ggn.probs.design.patterns.observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
	private StockObserable observable = null;
	private String email;

	public EmailAlertObserverImpl(String email, StockObserable observable) {
		this.email = email;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendMail(email, observable.getStockCount());
	}

	public void sendMail(String email, int stock) {
		System.out.println("IPhone stock is available and mail sent to : " + email);
	}

}
