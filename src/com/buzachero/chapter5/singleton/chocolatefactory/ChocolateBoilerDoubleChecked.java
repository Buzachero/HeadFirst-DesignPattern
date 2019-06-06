package com.buzachero.chapter5.singleton.chocolatefactory;

// Singleton
public class ChocolateBoilerDoubleChecked {
	private boolean empty;	
	private boolean boiled;
	private volatile static ChocolateBoilerDoubleChecked instance;
	
	private ChocolateBoilerDoubleChecked() {
		
	}
	
	/*
	 *  If instance is not created yet
	 *  then we synchronized the check of null
	 *  among the threads
	 */
	public static ChocolateBoilerDoubleChecked getInstance() { 
		if(instance == null) {
			synchronized(ChocolateBoilerDoubleChecked.class) {
				if(instance == null) {
					instance = new ChocolateBoilerDoubleChecked();
				}
			}			
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
