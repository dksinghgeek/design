package com.ggn.probs.design.patterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IPhoneStockObserableImpl implements StockObserable {
	private List<NotificationAlertObserver> observers = new ArrayList<>();
	private int stock = 0;

	@Override
	public void add(NotificationAlertObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserver observer : observers) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newStockCount) {
		if(stock == 0) {
			notifySubscriber();
		}
		
		stock = stock + newStockCount;
	}

	@Override
	public int getStockCount() {
		return stock;
	}

}
