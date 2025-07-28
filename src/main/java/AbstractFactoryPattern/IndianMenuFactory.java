package AbstractFactoryPattern;

public class IndianMenuFactory implements MenuFactory {
    public MainCourse createMainCourse() {
        return new IndianMainCourse();
    }

    public Drink createDrink() {
        return new IndianDrink();
    }
}
