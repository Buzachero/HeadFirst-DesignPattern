package com.buzachero.chapter4.factory.pizzastore;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type == null) {
			return null;
		}
		
		if(type.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new CaliforniaStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new CaliforniaStyleClamPizza();
		} else if(type.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		}
		
		return null;
	}

}
