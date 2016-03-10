package observer.weather;

import java.util.ArrayList;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers=new ArrayList<Observer>();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=temperature;
        meassurementsChanged();

    }
    public void meassurementsChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index=observers.indexOf(observer);
        if(index>=0)
            observers.remove(index);

    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(temperature,humidity,pressure);
        }

    }
}
