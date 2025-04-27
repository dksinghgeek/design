package com.ggn.probs.design.patterns.visitor;

public class TripleRoom implements Element {

	@Override
	public void accept(RoomVisitor roomVisitor) {
		roomVisitor.visit(this);
	}

}
