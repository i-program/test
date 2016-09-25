package com.iprogram.pattern.decorator;

public class Darkroast extends Beverage {
	public Darkroast(){
		this.description = "다크로스트";
	}

	@Override
	public double cost() {
		return .99;
	}
}
