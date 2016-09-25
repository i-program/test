package com.iprogram.pattern.command;

public class GarageDoorCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}

	@Override
	public void undo() {
		garageDoor.close();
	}
}
