package com.ggn.probs.design.patterns.visitor;

public interface RoomVisitor {
	public void visit(SingleRoom singleRoom);
	public void visit(DoubleRoom doubleRoom);
	public void visit(TripleRoom tripleRoom);
}
