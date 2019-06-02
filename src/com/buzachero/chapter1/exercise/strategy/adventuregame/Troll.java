package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class Troll extends Character {	
	
	public Troll() {
		weapon = new AxeBehaviour();
	}

	@Override
	public void fight() {
		System.out.println("Troll fighting...");
		weapon.useWeapon();
	}

}
