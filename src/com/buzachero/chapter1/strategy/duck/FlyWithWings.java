package com.buzachero.chapter1.strategy.duck;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying!");		
	}

}
