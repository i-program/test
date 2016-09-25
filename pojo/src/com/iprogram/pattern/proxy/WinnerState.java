package com.iprogram.pattern.proxy;

public class WinnerState implements State {
	private GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		
	}

	@Override
	public void ejectQuarter() {

	}

	@Override
	public void turnCrank() {

	}

	@Override
	public void dispense() {

	}
}
