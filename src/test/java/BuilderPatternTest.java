import BuilderPattern.Coffee;


public class BuilderPatternTest {
    public static void main(String[] args) {

        // A fancy iced oat milk latte with extra shot and whipped cream
        Coffee order1 = new Coffee.Builder("Large", "Latte")
            .makeIced(true)
            .addExtraShot(true)
            .setMilkType("Oat")
            .addToppings("Whipped Cream")
            .build();

        System.out.println("Order 1: " + order1);

        // A regular hot espresso with default milk
        Coffee order2 = new Coffee.Builder("Small", "Espresso")
            .build();

        System.out.println("Order 2: " + order2);
    }
}
