package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class BowAndArrowBehaviour implements WeaponBehaviour{

	@Override
	public void useWeapon() {		
		System.out.println("Using bow and arrow as weapons!");
	}

}
