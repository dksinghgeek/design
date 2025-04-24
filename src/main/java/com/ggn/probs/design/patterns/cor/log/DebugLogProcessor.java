package com.ggn.probs.design.patterns.cor.log;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}
	
	public void log(int logType, String message) {
		if (logType == DEBUG) {
			System.out.println("DEBUG : " + message);
		} else {
			logProcessor.log(logType, message);
		}
	}

}
