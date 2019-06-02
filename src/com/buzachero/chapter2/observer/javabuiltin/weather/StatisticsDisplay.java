package com.buzachero.chapter2.observer.javabuiltin.weather;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Observable weatherData;	
	
	public StatisticsDisplay(Observable observable) {		
		this.weatherData = observable;
		weatherData.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object obj) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			float temperature = weatherData.getTemperature();
			
			tempSum += temperature;
			numReadings++;

			if (temperature > maxTemp) {
				maxTemp = temperature;
			}
	 
			if (temperature < minTemp) {
				minTemp = temperature;
			}

			display();
		}
		
	}	
	
	private float calculateAverageTemperature() {
		return tempSum/numReadings;
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + calculateAverageTemperature() 
							+ "/" + maxTemp 
							+ "/" + minTemp);		
	}

}
