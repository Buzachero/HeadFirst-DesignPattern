package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class Knight extends Character {
	
	public Knight() {
		weapon = new KnifeBehaviour();
	}

	@Override
	public void fight() {
		System.out.println("Knight fighting...");
		weapon.useWeapon();
	}

}
