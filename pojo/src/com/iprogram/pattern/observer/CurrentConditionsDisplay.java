package com.iprogram.pattern.observer;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity.");
	}

	@Override
	public void update(Observable observable, Object object) {
		if(object instanceof WeatherData){
			WeatherData weatherData = (WeatherData) object;

			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}
