package StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String name, String creditCardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit card.");
    }

}
