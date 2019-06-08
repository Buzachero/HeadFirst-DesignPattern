package com.buzachero.chapter3.decorator.startbuzz;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
}
