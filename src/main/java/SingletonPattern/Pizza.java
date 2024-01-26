package SingletonPattern;

// Static variable reference of single instance of type Singleton
public class Pizza {
    private static Pizza single_instance = null;

    // Declaring a variable of type String
    public String type;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Pizza() {
        type = "Veggie Delight Pizza";
    }

    // Static method to create instance of Singleton class
    public static synchronized Pizza getInstance()
    {
        if (single_instance == null) {
            single_instance = new Pizza();
        }

        return single_instance;
    }
}