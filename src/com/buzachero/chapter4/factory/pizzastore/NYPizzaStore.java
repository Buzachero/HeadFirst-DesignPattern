package com.buzachero.chapter4.factory.pizzastore;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type == null) {
			return null;
		}
		
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if(type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		}
		
		return null;
	}

}
