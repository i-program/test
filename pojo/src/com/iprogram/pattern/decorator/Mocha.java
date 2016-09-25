package com.iprogram.pattern.decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}
}
