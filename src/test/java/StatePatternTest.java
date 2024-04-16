import StatePattern.TVContext;
import StatePattern.TVStartState;
import StatePattern.TVState;
import StatePattern.TVStopState;

public class StatePatternTest {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        TVState tvStartState = new TVStartState();
        TVState tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();

    }
}
