package com.buzachero.chapter5.singleton.chocolatefactory;

// Singleton
public class ChocolateBoilerEagerInstantiation {
	private boolean empty;	
	private boolean boiled;
	/*
	 *  There will always be one single instance in app
	 *  Instance is created in the moment app is started
	 */
	private static ChocolateBoilerEagerInstantiation instance =  new ChocolateBoilerEagerInstantiation();
	
	private ChocolateBoilerEagerInstantiation() {
		
	}
	
	/*
	 *  no need to check if instance is null:
	 *  instance already created
	 */
	
	public static ChocolateBoilerEagerInstantiation getInstance() { 
				
		return instance;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
}
