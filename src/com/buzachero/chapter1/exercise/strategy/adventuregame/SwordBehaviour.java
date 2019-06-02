package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class SwordBehaviour implements WeaponBehaviour{

	@Override
	public void useWeapon() {		
		System.out.println("Using sword as weapon!");
	}

}
