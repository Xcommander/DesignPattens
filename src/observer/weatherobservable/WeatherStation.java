package observer.weatherobservable;

import java.time.temporal.ChronoUnit;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,34f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
