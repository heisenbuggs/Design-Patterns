package ObserverPattern;

public class ObserverImpl implements Observer {

    private String name;
    private Subject subject;

    public ObserverImpl(String name){
        this.name = name;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        String message = (String) subject.getUpdate(this);
        if (message == null) {
            System.out.println(name + " :: No new message");
        } else {
            System.out.println(name + " :: Consuming message :: " + message);
        }
    }
}
