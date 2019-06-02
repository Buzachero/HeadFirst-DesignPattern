package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class King extends Character {

	public King() {
		weapon = new SwordBehaviour();
	}

	@Override
	public void fight() {
		System.out.println("King fighting...");
		weapon.useWeapon();
	}

}
