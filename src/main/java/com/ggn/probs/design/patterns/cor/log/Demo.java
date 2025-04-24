package com.ggn.probs.design.patterns.cor.log;

public class Demo {

	public static void main(String[] args) {
		LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		logger.log(3, "RunTimeException");
		logger.log(2, "CompileTimeException");
	}

}
