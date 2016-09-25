package com.iprogram.pattern.decorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.20;
	}
}
