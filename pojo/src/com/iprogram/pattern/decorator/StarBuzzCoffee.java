package com.iprogram.pattern.decorator;

public class StarBuzzCoffee {
	public static void main(String[] args){
		try{
			Beverage beverage = new Espresso();
			System.out.println("beverage = " + beverage.getDescription() +", $" + beverage.cost());

			Beverage darkroast = new Darkroast();
			System.out.println("beverage = " + darkroast.getDescription() +", $" + darkroast.cost());

			darkroast = new Mocha(darkroast);
			System.out.println("beverage = " + darkroast.getDescription() +", $" + darkroast.cost());

			darkroast = new Whip(darkroast);
			System.out.println("beverage = " + darkroast.getDescription() +", $" + darkroast.cost());
		}catch(Exception exception){
			System.out.println("exception : " + exception);
		}
	}
}
