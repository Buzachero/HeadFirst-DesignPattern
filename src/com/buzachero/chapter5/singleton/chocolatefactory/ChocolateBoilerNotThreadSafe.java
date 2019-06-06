package com.buzachero.chapter5.singleton.chocolatefactory;

// Singleton
public class ChocolateBoilerNotThreadSafe {
	private boolean empty;	
	private boolean boiled;
	private static ChocolateBoilerNotThreadSafe instance;
	
	private ChocolateBoilerNotThreadSafe() {
		
	}
	
	/*
	 *  if 2 threads run method below at same time 
	 *  and instance was not created yet
	 *  so there will be 2 instances of Singleton class in application
	 *  which is wrong 
	 */
	public static ChocolateBoilerNotThreadSafe getInstance() { 
		if(instance == null) {
			instance = new ChocolateBoilerNotThreadSafe();
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
