package observer.weather;


/**
 * Created by xulinchao on 2016/3/10.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
interface Observer{
    public void update(float temp,float humiddity,float pressure);
}
interface DisplayElement{
    public void display();
}