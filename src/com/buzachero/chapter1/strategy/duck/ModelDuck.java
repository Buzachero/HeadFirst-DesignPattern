package com.buzachero.chapter1.strategy.duck;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck!");		
	}

}
