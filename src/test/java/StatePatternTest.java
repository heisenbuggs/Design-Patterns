import StatePattern.DocumentContext;

public class StatePatternTest {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();

        // Initial state: Draft
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCurrent State: " + document.getState().getClass().getSimpleName());
            document.process();
        }
    }
}
