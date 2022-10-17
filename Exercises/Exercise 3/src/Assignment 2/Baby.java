import java.util.ArrayList;

public class Baby implements Subject{

    private ArrayList<Observer> observers;
    private int cryValue;

    public Baby() {
        observers = new ArrayList<>();
        cryValue = -1;
    }

    public void relax()
    {
        cryValue = -1;
        notifyObservers();
    }

    public void sob()
    {
        cryValue = 0;
        notifyObservers();
    }

    public void cry()
    {
        cryValue = 1;
        notifyObservers();
    }

    public void scream()
    {
        cryValue = 2;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer: observers )
            observer.update(cryValue);
    }
}
