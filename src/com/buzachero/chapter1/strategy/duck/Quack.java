package com.buzachero.chapter1.strategy.duck;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack");		
	}

}
