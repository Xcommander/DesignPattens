package observer.weather;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("The current conditions : "+temperature+" F degrees and "+
        humidity+"% humidity");

    }


    @Override
    public void update(float temp, float humiddity, float pressure) {
        this.temperature=temp;
        this.humidity=humiddity;
        display();
    }
}
