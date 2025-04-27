package com.ggn.probs.design.patterns.visitor;

public class SingleRoom implements Element {

	@Override
	public void accept(RoomVisitor roomVisitor) {
		roomVisitor.visit(this);
	}

}
