package StatePattern;

public class ReviewState implements DocumentState {

    @Override
    public void handleRequest(DocumentContext context) {
        System.out.println("Document is under REVIEW. Moving to PUBLISHED...");
        context.setState(new PublishedState());
    }
}
