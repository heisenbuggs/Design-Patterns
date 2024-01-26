import ChainOfResponsibilityPattern.Currency;
import ChainOfResponsibilityPattern.DispenseChain;
import ChainOfResponsibilityPattern.TenRupeesDispenser;
import ChainOfResponsibilityPattern.TwentyRupeesDispenser;
import ChainOfResponsibilityPattern.FiftyRupeesDispenser;

import java.util.Scanner;

public class ChainOfResponsibilityPatternTest {
    private DispenseChain c1;

    public ChainOfResponsibilityPatternTest() {
        // Initialize the chain
        this.c1 = new FiftyRupeesDispenser();
        DispenseChain c2 = new TwentyRupeesDispenser();
        DispenseChain c3 = new TenRupeesDispenser();

        // Set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityPatternTest atmDispenser = new ChainOfResponsibilityPatternTest();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // Process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}
