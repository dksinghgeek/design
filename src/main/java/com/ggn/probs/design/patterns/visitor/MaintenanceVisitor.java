package com.ggn.probs.design.patterns.visitor;

public class MaintenanceVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom singleRoom) {
		System.out.println("Single room maintenance");
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		System.out.println("Double room maintenance");
	}

	@Override
	public void visit(TripleRoom tripleRoom) {
		System.out.println("Triple room maintenance");
	}

}
