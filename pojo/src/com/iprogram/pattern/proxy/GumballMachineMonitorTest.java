package com.iprogram.pattern.proxy;

public class GumballMachineMonitorTest {
	public static void main(String[] args){
		try{
			GumballMachine gumballMachine = new GumballMachine("서울 강남구", 10);
			GumballMachineMonitor gumballMachineMonitor = new GumballMachineMonitor(gumballMachine);

			gumballMachineMonitor.report();
		}catch(Exception exception){
			System.out.println("exception : " + exception);
		}
	}
}
