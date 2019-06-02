package com.buzachero.chapter2.observer.weather;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
