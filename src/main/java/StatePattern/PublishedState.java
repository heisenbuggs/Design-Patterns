package StatePattern;

public class PublishedState implements DocumentState {

    @Override
    public void handleRequest(DocumentContext context) {
      System.out.println("Document is PUBLISHED. Moving to ARCHIVED...");
      context.setState(new ArchivedState());
    }
}
