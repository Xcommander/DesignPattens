package observer.weatherobservable;

import java.util.Observable;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=temperature;
        meassurementsChanged();

    }
    public void meassurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
