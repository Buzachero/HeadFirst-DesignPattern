package com.buzachero.chapter1.strategy.duck;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak");				
	}
}
