package com.ggn.probs.design.patterns.visitor;

public class Demo {

	public static void main(String[] args) {
		RoomVisitor paymentVisitor = new PaymentVisitor();
		Element element = new DoubleRoom();
		element.accept(paymentVisitor);
		
		RoomVisitor maintenanceVisitor = new MaintenanceVisitor();
		element.accept(maintenanceVisitor);
		
	}

}
