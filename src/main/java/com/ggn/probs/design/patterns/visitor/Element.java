package com.ggn.probs.design.patterns.visitor;

public interface Element {
	public void accept(RoomVisitor roomVisitor);
}
