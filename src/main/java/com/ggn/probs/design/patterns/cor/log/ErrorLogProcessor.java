package com.ggn.probs.design.patterns.cor.log;

public class ErrorLogProcessor extends LogProcessor {

	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}
	
	public void log(int logType, String message) {
		if (logType == ERROR) {
			System.out.println("ERROR : " + message);
		} else {
			logProcessor.log(logType, message);
		}
	}

}
