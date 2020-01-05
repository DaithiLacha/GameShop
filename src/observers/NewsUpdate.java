package observers;

import java.util.ArrayList;

public class NewsUpdate implements Subject {
    private ArrayList<Observer> observers;
    private String newsUpdate;

    public NewsUpdate() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(newsUpdate);
        }
    }

    public void makeAnnouncement(String newsUpdate) {
        this.newsUpdate = newsUpdate;
        notifyObservers();
    }
}
