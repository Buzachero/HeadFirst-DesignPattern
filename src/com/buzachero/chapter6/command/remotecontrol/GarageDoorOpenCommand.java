package com.buzachero.chapter6.command.remotecontrol;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {		
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {	
		this.garageDoor.up();
	}

}
