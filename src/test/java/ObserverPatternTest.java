import ObserverPattern.SubjectImpl;
import ObserverPattern.ObserverImpl;
import ObserverPattern.Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create subject
        SubjectImpl subject = new SubjectImpl();

        // Create observers
        Observer observer1 = new ObserverImpl("Observer1");
        Observer observer2 = new ObserverImpl("Observer2");
        Observer observer3 = new ObserverImpl("Observer3");

        // Register observers to the subject
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        // Attach observer to subject
        observer1.setSubject(subject);
        observer2.setSubject(subject);
        observer3.setSubject(subject);

        // Check if any update is available
        observer1.update();

        // Now send message to subject
        subject.postMessage("The subject is updated");

        // Unsubscribe the user
        subject.unregister(observer2);

        // Notify again to the registered observers
        subject.postMessage("The subject is updated");
    }
}
