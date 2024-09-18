package ObserverPattern;

public interface Observer {

    // Method to askUpdate the observer, used by subject
    void askUpdate();

    // Attach with subject to observe
    void setSubject(Subject subject);
}
