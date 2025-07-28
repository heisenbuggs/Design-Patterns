package StatePattern;

/**
 * Interface representing the state of a document in a state pattern implementation.
 */
public interface DocumentState {

    void handleRequest(DocumentContext context);
}
