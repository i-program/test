package com.iprogram.pattern.observer;

public class WeatherStation {
	public static void main(String[] args) {
		try {
			WeatherData weatherData = new WeatherData();

			CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
			CurrentConditionsDisplay statisticsDisplay = new CurrentConditionsDisplay(weatherData);
			CurrentConditionsDisplay forecastDisplay = new CurrentConditionsDisplay(weatherData);

			weatherData.setMeasurements(80, 65, 30.4f);

		} catch (Exception exception) {
			System.out.println("WeatherStation exception : " + exception);
		}
	}

}
