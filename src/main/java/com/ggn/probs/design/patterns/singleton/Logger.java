package com.ggn.probs.design.patterns.singleton;


public class Logger {
	private static Logger LOGGER = null;
	
	private Logger() {
		if(LOGGER != null) {
			 throw new RuntimeException("Invalid Operation!!"); 
		}
	}
	
	public static Logger getLogger() {
		if(LOGGER == null) {
			synchronized (Logger.class) {
				if(LOGGER == null)
					LOGGER = new Logger();
			}
		}
		
		return LOGGER;
	}

	public static void main(String[] args) {

	}

}
