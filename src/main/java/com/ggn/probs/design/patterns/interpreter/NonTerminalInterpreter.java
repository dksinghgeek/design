package com.ggn.probs.design.patterns.interpreter;

public class NonTerminalInterpreter implements Interpreter {
	private Interpreter left = null;
	private Interpreter right = null;
	
	public NonTerminalInterpreter(Interpreter left, Interpreter right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Context context) {
		return left.interpret(context) * right.interpret(context);
	}

}
