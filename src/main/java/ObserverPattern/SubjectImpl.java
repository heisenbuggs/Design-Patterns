package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public SubjectImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer.");
        synchronized (MUTEX) {
            if (!observerList.contains(observer))
                observerList.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        synchronized (MUTEX) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        // Synchronization is used to make sure any observer registered
        // after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observerList);
            this.changed = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    // Method to post message to the topic
    public void postMessage(String message) {
        System.out.println("Message Posted to Topic : " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }

}
