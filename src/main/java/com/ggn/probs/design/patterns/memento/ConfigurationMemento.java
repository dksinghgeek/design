package com.ggn.probs.design.patterns.memento;

public class ConfigurationMemento {
	private int heigth;
	private int width;

	public ConfigurationMemento(int heigth, int width) {
		this.heigth = heigth;
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public int getWidth() {
		return width;
	}

}
