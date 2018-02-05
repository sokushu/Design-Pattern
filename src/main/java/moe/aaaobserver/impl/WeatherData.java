package moe.aaaobserver.impl;

import java.util.ArrayList;
import moe.aaaobserver.inter.Observers;
import moe.aaaobserver.inter.Subject;

/**
 * WeatherData
 */
public class WeatherData implements Subject {

    private ArrayList<Object> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Object>();
    }

	public void registerObserver(Observers o) {
		observers.add(o);
	}

	public void removeObserver(Observers o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
	}

	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++){
            Observers observers = (Observers) this.observers.get(i);
            observers.updata(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    
}