package com.buzachero.chapter3.decorator.startbuzz;

public class Espresso extends Beverage {
	
	
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {		
		return 1.99;
	}

}
