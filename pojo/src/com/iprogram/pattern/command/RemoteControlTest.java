package com.iprogram.pattern.command;

public class RemoteControlTest {
	public static void main(String[] args){
		try{
			SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
			LightOnCommand lightOnCommand = new LightOnCommand(new Light());
			LightOffCommand lightOffCommand = new LightOffCommand(new Light());

			simpleRemoteControl.setCommand(lightOnCommand);
			simpleRemoteControl.buttonWasPressed();

			GarageDoorCommand garageDoorCommand = new GarageDoorCommand(new GarageDoor());
			simpleRemoteControl.setCommand(garageDoorCommand);
			simpleRemoteControl.buttonWasPressed();
			simpleRemoteControl.undoButtonWasPressed();

			Command[] commands = new Command[]{lightOnCommand, lightOffCommand, garageDoorCommand};
			MacroCommand macroCommand = new MacroCommand(commands);
			macroCommand.execute();

		}catch(Exception exception){
			System.out.println("exception : " + exception);
		}
	}
}
