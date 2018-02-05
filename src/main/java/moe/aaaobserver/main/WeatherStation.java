package moe.aaaobserver.main;

import moe.aaaobserver.impl.CurrentConditionsDisplay;
import moe.aaaobserver.impl.WeatherData;

/**
 * WeatherStation
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}