package com.ggn.probs.design.patterns.cor.log;

public abstract class LogProcessor {
	protected final static int INFO = 1;
	protected final static int DEBUG = 2;
	protected final static int ERROR = 3;

	protected LogProcessor logProcessor;

	public LogProcessor(LogProcessor logProcessor) {
		this.logProcessor = logProcessor;
	}
	
	public void log(int logType, String message) {
		logProcessor.log(logType, message);
	}
}
