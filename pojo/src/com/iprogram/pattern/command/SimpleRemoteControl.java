package com.iprogram.pattern.command;

public class SimpleRemoteControl {
	private Command slot;

	public SimpleRemoteControl(){};

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonWasPressed(){
		if (slot == null) {
			System.out.println("slot is empty.");
			return;
		}

		slot.execute();
	}

	public void undoButtonWasPressed(){
		if (slot == null) {
			System.out.println("slot is empty.");
			return;
		}

		slot.undo();
	}
}
