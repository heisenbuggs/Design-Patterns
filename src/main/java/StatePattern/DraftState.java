package StatePattern;

public class DraftState implements DocumentState {

    @Override
    public void handleRequest(DocumentContext context) {
        System.out.println("Document is in DRAFT state. Moving to REVIEW...");
        context.setState(new ReviewState());
    }
}
