package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class KnifeBehaviour implements WeaponBehaviour{

	@Override
	public void useWeapon() {		
		System.out.println("Using knife as weapon!");
	}

}
