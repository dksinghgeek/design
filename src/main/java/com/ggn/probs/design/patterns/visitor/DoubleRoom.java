package com.ggn.probs.design.patterns.visitor;

public class DoubleRoom implements Element {

	@Override
	public void accept(RoomVisitor roomVisitor) {
		roomVisitor.visit(this);
	}

}
