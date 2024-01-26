import SingletonPattern.Car;

public class SingletonPatternTest {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Car x = Car.getInstance();

        // Instantiating Singleton class with variable y
        Car y = Car.getInstance();

        // Instantiating Singleton class with variable z
        Car z = Car.getInstance();

        x.brand = x.brand.toUpperCase();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Brand of car X is " + x.brand + ". Hashcode of x is " + x.hashCode());
        System.out.println("Brand of car X is " + y.brand + ". Hashcode of x is " + y.hashCode());
        System.out.println("Brand of car X is " + z.brand + ". Hashcode of x is " + z.hashCode());

        // Condition check
        if (x == y && y == z) {
            // Print statement
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            // Print statement
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }


    }
}
