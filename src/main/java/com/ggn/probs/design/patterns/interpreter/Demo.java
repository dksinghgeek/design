package com.ggn.probs.design.patterns.interpreter;

public class Demo {

	public static void main(String[] args) {
		Context context = new Context();
		context.put("a", 2);
		context.put("b", 3);
		
		Interpreter interpreter = new NonTerminalInterpreter(new TerminalInterpreter("a"), new TerminalInterpreter("b"));
		System.out.println(interpreter.interpret(context));
	}

}
