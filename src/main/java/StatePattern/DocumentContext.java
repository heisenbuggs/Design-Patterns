package StatePattern;

public class DocumentContext {
    private DocumentState currentState;

    public DocumentContext() {
        // Start in Draft state by default
        currentState = new DraftState();
    }

    public void setState(DocumentState state) {
        this.currentState = state;
    }

    public DocumentState getState() {
        return currentState;
    }

    public void process() {
        currentState.handleRequest(this);
    }
}
