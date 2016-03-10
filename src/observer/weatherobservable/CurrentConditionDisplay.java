package observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.temperature=((WeatherData) o).getTemperature();
            this.humidity=((WeatherData) o).getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("The current conditions : " + temperature + " F degrees and " +
                humidity + "% humidity");
    }
}
