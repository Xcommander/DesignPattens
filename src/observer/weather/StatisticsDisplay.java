package observer.weather;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class StatisticsDisplay implements Observer,DisplayElement{
    private float maxTemp=0.0f;
    private float minTemp=200;
    private float sumTemp=0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (sumTemp / numReadings)
                + "/" + maxTemp + "/" + minTemp);

    }


    @Override
    public void update(float temp, float humiddity, float pressure) {
        sumTemp +=temp;
        numReadings++;
        if(maxTemp<temp)
            maxTemp=temp;
        else if(minTemp>temp)
            minTemp=temp;
        display();


    }
}
