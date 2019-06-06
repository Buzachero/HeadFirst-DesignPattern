package com.buzachero.chapter5.singleton.chocolatefactory;

// Singleton
public class ChocolateBoilerSynchronized {
	private boolean empty;	
	private boolean boiled;
	private static ChocolateBoilerSynchronized instance;
	
	private ChocolateBoilerSynchronized() {
		
	}
	
	/*
	 *  Method is thread safe
	 *  So, there will be only 1 single instance in app
	 *  even for multi threads app
	 *  Can cause performance issue, 
	 *  dependending on how often this method is being called 
	 */
	public static synchronized ChocolateBoilerSynchronized getInstance() { 
		if(instance == null) {
			instance = new ChocolateBoilerSynchronized();
		}
		
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
