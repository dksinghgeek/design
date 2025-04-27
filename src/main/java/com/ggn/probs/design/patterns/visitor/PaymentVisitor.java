package com.ggn.probs.design.patterns.visitor;

public class PaymentVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom singleRoom) {
		System.out.println("Single room payment");
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		System.out.println("Double room payment");
	}

	@Override
	public void visit(TripleRoom tripleRoom) {
		System.out.println("Triple room payment");
	}
}
