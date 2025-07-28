import AbstractFactoryPattern.IndianMenuFactory;
import AbstractFactoryPattern.ItalianMenuFactory;
import AbstractFactoryPattern.MenuFactory;


public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        MenuFactory indianMenu = new IndianMenuFactory();
        System.out.println("Indian Menu:");
        System.out.println("Main Course: " + indianMenu.createMainCourse().getDish());
        System.out.println("Drink: " + indianMenu.createDrink().getDrink());

        System.out.println();

        MenuFactory italianMenu = new ItalianMenuFactory();
        System.out.println("Italian Menu:");
        System.out.println("Main Course: " + italianMenu.createMainCourse().getDish());
        System.out.println("Drink: " + italianMenu.createDrink().getDrink());
    }
}
