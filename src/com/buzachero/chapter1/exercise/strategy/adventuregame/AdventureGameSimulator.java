package com.buzachero.chapter1.exercise.strategy.adventuregame;

public class AdventureGameSimulator {

	// Creating and Using STRATEGY pattern 
	public static void main(String[] args) {		
		Character c = new King();
		c.fight();
		System.out.println("---------------");
		c = new Queen();
		c.fight();
		System.out.println("---------------");
		c = new Knight();
		c.fight();
		System.out.println("---------------");
		c = new Troll();
		c.fight();
		c.setWeapon(new SwordBehaviour());
		c.fight();
	}

}
