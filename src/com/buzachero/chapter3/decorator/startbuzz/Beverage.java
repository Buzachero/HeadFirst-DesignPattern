package com.buzachero.chapter3.decorator.startbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public abstract double cost();	
	
	public String getDescription() {
		return this.description;
	}
}
