package com.ggn.probs.design.patterns.command;

import java.util.Stack;

public class RemoteControl {
	private Stack<Command> commandHistory;
	private Command command;
	
	public RemoteControl() {
		this.commandHistory = new Stack<>();
	}
	
	public void add(Command command) {
		this.command = command;
	}
	
	public void processButton() {
		command.execute();
		commandHistory.push(command);
	}
	
	public void undo() {
		if(commandHistory.size() > 0) {
			Command command = commandHistory.pop();
			command.undo();
		}
	}
}
