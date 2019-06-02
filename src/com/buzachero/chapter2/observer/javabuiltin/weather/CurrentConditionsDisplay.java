package com.buzachero.chapter2.observer.javabuiltin.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {		
		this.weatherData = observable;
		weatherData.addObserver(this);
	}	
	
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}				
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "C degrees and " 
							+ humidity + "% humidity");		
	}
}
