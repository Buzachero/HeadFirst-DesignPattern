package com.buzachero.chapter1.strategy.duck;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly!");		
	}

}
