package com.iprogram.pattern.proxy;

public class GumballMachineMonitor {
	private GumballMachine gumballMachine;

	public GumballMachineMonitor(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void report(){
		System.out.println("뽑기 기계 위치 : " + gumballMachine.getLocation());
		System.out.println("뽑기 재고 : " + gumballMachine.getNumberOfGumballs());
		System.out.println("뽑기 상태 : " + gumballMachine.getState());
	}
}
