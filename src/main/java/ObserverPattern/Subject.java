package ObserverPattern;

public interface Subject {

    // Methods to register and unregister observers
    public void register(Observer obj);

    public void unregister(Observer obj);

    // Method to notify observers of change
    public void notifyObservers();

    // Method to get updates from subject
    public Object getUpdate(Observer obj);

}
