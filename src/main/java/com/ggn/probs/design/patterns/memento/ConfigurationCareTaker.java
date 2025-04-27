package com.ggn.probs.design.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
	private List<ConfigurationMemento> configurationMementos;
	
	public ConfigurationCareTaker() {
		this.configurationMementos = new ArrayList<>();
	}
	
	public void addMemento(ConfigurationMemento configurationMemento) {
		configurationMementos.add(configurationMemento);
	}
	
	public ConfigurationMemento undo() {
		if(configurationMementos.size() > 0) {
			int lastIndex = configurationMementos.size() - 1;
			return configurationMementos.remove(lastIndex);
		}
		
		return null;
	}
}
