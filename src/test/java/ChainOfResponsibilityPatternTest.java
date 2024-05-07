import ChainOfResponsibilityPattern.Currency;
import ChainOfResponsibilityPattern.DispenseChain;
import ChainOfResponsibilityPattern.TenRupeesDispenser;
import ChainOfResponsibilityPattern.TwentyRupeesDispenser;
import ChainOfResponsibilityPattern.FiftyRupeesDispenser;

import java.util.Scanner;

public class ChainOfResponsibilityPatternTest {
    private DispenseChain dispenseChain1;

    public ChainOfResponsibilityPatternTest() {
        // Initialize the chain
        this.dispenseChain1 = new FiftyRupeesDispenser();
        DispenseChain dispenseChain2 = new TwentyRupeesDispenser();
        DispenseChain dispenseChain3 = new TenRupeesDispenser();

        // Set the chain of responsibility
        dispenseChain1.setNextChain(dispenseChain2);
        dispenseChain2.setNextChain(dispenseChain3);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityPatternTest atmDispenser = new ChainOfResponsibilityPatternTest();

        while (true) {
            int amount;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            // Process the request
            atmDispenser.dispenseChain1.dispense(new Currency(amount));
        }
    }
}
