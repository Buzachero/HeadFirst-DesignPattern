package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class AxeBehaviour implements WeaponBehaviour{

	@Override
	public void useWeapon() {		
		System.out.println("Using axe as weapon!");
	}

}
