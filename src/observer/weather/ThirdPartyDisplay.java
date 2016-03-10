package observer.weather;

import java.util.Observable;

/**
 * Created by xulinchao on 2016/3/10.
 */
public class ThirdPartyDisplay implements Observer,DisplayElement {
    @Override
    public void display() {

    }


    @Override
    public void update(float temp, float humiddity, float pressure) {

    }
}
class xlc extends Observable{
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public synchronized void deleteObservers() {
        super.deleteObservers();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public synchronized void deleteObserver(java.util.Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public synchronized void addObserver(java.util.Observer o) {
        super.addObserver(o);
    }
}
class xlc1 implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {

    }
}
