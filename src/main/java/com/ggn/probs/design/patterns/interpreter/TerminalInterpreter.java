package com.ggn.probs.design.patterns.interpreter;

public class TerminalInterpreter implements Interpreter {
	private String key = null;
	
	public TerminalInterpreter(String key) {
		this.key = key;
	}

	@Override
	public int interpret(Context context) {
		return context.get(key);
	}

}
