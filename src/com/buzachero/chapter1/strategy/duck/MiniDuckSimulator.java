package com.buzachero.chapter1.strategy.duck;

public class MiniDuckSimulator {

	// Creating and Using STRATEGY pattern 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println("---------------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}

}
