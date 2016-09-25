package com.iprogram.pattern.decorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return beverage.cost() + .50;
	}
}
