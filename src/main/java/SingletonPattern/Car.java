package SingletonPattern;

// Static variable reference of single instance of type Singleton
public class Car {
    private static Car single_instance = null;

    // Declaring a variable of type String
    public String brand;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Car() {
        brand = "audi";
    }

    // Static method to create instance of Singleton class
    public static synchronized Car getInstance()
    {
        if (single_instance == null) {
            single_instance = new Car();
        }

        return single_instance;
    }
}