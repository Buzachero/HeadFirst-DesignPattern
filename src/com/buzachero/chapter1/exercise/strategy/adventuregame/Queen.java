package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class Queen extends Character {	
	
	public Queen() {
		weapon = new BowAndArrowBehaviour();
	}

	@Override
	public void fight() {
		System.out.println("Queen fighting...");
		weapon.useWeapon();
	}

}
