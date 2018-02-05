package moe.aaaobserver.impl;

import moe.aaaobserver.inter.DisplayElement;
import moe.aaaobserver.inter.Observers;
import moe.aaaobserver.inter.Subject;

/**
 * CurrentConditionsDisplay
 */
public class CurrentConditionsDisplay implements Observers, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void updata(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
	}

    
}