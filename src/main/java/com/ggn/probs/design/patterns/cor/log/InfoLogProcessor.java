package com.ggn.probs.design.patterns.cor.log;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	public void log(int logType, String message) {
		if (logType == INFO) {
			System.out.println("INFO : " + message);
		} else {
			logProcessor.log(logType, message);
		}
	}

}
