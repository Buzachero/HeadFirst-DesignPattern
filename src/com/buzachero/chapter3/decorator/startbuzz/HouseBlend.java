package com.buzachero.chapter3.decorator.startbuzz;

public class HouseBlend extends Beverage {
		
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {		
		return .89;
	}

}
