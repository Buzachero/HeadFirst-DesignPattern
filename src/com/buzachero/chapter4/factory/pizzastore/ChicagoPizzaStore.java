package com.buzachero.chapter4.factory.pizzastore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type == null) {
			return null;
		}
		
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if(type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}
		
		return null;
	}

}
