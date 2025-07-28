import StrategyPattern.CreditCardStrategy;
import StrategyPattern.Item;
import StrategyPattern.PhonePeUPIStrategy;
import StrategyPattern.ShoppingCart;

public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("ITM040700",40);
        Item item2 = new Item("ITM031000",70);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // --- Apply different payment strategies ---

        // Pay by PhonePe UPI
        shoppingCart.pay(new PhonePeUPIStrategy("myemail@example.com", "mypwd"));

        // Pay by credit card
        shoppingCart.pay(new CreditCardStrategy("Prasuk Jain", "123456789", "786", "12/32"));
    }
}
