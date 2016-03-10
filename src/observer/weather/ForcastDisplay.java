package observer.weather;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class ForcastDisplay implements Observer, DisplayElement {
    private float currentPressure = 22.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForcastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure)
            System.out.println("Improving weather on the way!");
        else if (currentPressure == lastPressure)
            System.out.println("More of the same!");
        else
            System.out.println("Watch out of cooler,rainy weather!");

    }


    @Override
    public void update(float temp, float humiddity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
