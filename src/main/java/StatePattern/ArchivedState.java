package StatePattern;

public class ArchivedState implements DocumentState {
    @Override
    public void handleRequest(DocumentContext context) {
      System.out.println("Document is ARCHIVED. No further transitions allowed.");
      // Stays in Archived state
    }
}
