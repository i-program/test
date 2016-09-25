package com.iprogram.pattern.proxy;

public class SoldState implements State {
	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
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
