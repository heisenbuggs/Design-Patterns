package AbstractFactoryPattern;

public class ItalianMenuFactory implements MenuFactory {
    public MainCourse createMainCourse() {
        return new ItalianMainCourse();
    }

    public Drink createDrink() {
        return new ItalianDrink();
    }
}
