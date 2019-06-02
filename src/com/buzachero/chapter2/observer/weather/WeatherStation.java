package com.buzachero.chapter2.observer.weather;

public class WeatherStation {
	
	// Creating and Using OBSERVE pattern
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);
		
		System.out.println("-------------------");
		weatherData.setMeasurements(30, 65, 30.4f);
		System.out.println("-------------------");
		weatherData.setMeasurements(32, 70, 29.2f);
		System.out.println("-------------------");
		weatherData.setMeasurements(25, 90, 29.2f);
	}

}
