package com.buzachero.chapter2.observer.javabuiltin.weather;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private Observable weatherData;	
	private float currentPressure = 29.92f;  
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {		
		this.weatherData = observable;
		weatherData.addObserver(this);	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			lastPressure = currentPressure;			
			currentPressure = weatherData.getPressure();
			display();
		}
		
	}	

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}	
	}	

}
