import ObserverPattern.MyTopic;
import ObserverPattern.MyTopicSubscriber;
import ObserverPattern.Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create subject
        MyTopic topic = new MyTopic();

        // Create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // Register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // Attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // Check if any update is available
        obj1.update();

        // Now send message to subject
        topic.postMessage("The topic has started.");
    }
}
