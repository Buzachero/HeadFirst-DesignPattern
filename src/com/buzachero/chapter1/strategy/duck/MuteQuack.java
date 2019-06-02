package com.buzachero.chapter1.strategy.duck;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
