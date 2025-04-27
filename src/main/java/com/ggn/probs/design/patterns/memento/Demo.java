package com.ggn.probs.design.patterns.memento;

public class Demo {

	public static void main(String[] args) {
		ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
		
		ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(1, 1);
		ConfigurationMemento  configurationMemento = configurationOriginator.createMemento();
		
		configurationCareTaker.addMemento(configurationMemento);
		
		configurationOriginator = new ConfigurationOriginator(2, 2);
		configurationMemento = configurationOriginator.createMemento();
		
		configurationCareTaker.addMemento(configurationMemento);
		
		ConfigurationMemento restore = configurationCareTaker.undo();
		
		configurationOriginator.restoreMemento(restore);
		System.out.println("Restore - Height : " +  configurationOriginator.getHeight() + " width : " + configurationOriginator.getWidth());
		
		
	}

}
