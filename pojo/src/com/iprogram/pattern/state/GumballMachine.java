package com.iprogram.pattern.state;

public class GumballMachine {
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	private State state = soldOutState;

	public int getNumberOfGumballs() {
		return numberOfGumballs;
	}

	private int numberOfGumballs = 0;

	public GumballMachine(int numberOfGumballs) {
		if(numberOfGumballs < 1){
			return;
		}

		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.numberOfGumballs = numberOfGumballs;
		state = noQuarterState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void trunCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot ...");
		if(this.numberOfGumballs > 0){
			this.numberOfGumballs -= 1;
		}
	}
}