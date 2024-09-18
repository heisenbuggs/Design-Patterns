package StrategyPattern;

public class PhonePeUPIStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PhonePeUPIStrategy(String email, String password){
        this.emailId = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PhonePe UPI.");
    }

}
