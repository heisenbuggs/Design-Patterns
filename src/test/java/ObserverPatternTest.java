import ObserverPattern.SubjectImpl;
import ObserverPattern.ObserverSubscriber;
import ObserverPattern.Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create subject
        SubjectImpl subject = new SubjectImpl();

        // Create observers
        Observer obj1 = new ObserverSubscriber("Obj1");
        Observer obj2 = new ObserverSubscriber("Obj2");
        Observer obj3 = new ObserverSubscriber("Obj3");

        // Register observers to the subject
        subject.register(obj1);
        subject.register(obj2);
        subject.register(obj3);

        // Attach observer to subject
        obj1.setSubject(subject);
        obj2.setSubject(subject);
        obj3.setSubject(subject);

        // Check if any update is available
        obj1.update();

        // Now send message to subject
        subject.postMessage("The subject is updated");

        // Unsubscribe the user
        subject.unregister(obj2);

        // Notify again to the registered observers
        subject.postMessage("The subject is updated");
    }
}
