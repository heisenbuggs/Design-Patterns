import DecoratorPattern.BasicCar;
import DecoratorPattern.Car;
import DecoratorPattern.LuxuryCar;
import DecoratorPattern.SportsCar;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Base basic car with additional sports car feature.
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n*****");

        // Base basic car with additional with luxury and sports car feature.
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
