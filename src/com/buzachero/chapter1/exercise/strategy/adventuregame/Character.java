package com.buzachero.chapter1.exercise.strategy.adventuregame;

public abstract class Character {
	public WeaponBehaviour weapon;	

	public abstract void fight();
	
	public void setWeapon(WeaponBehaviour weapon) {
		this.weapon = weapon;
	}
	
}
