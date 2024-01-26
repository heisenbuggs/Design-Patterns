import SingletonPattern.Pizza;

public class SingletonPatternTest {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Pizza x = Pizza.getInstance();

        // Instantiating Singleton class with variable y
        Pizza y = Pizza.getInstance();

        // Instantiating Singleton class with variable z
        Pizza z = Pizza.getInstance();

        x.type = "Farmhouse Pizza";

        // Printing the hash code for above variable as
        // declared
        System.out.println("Brand of car X is " + x.type + ". Hashcode of x is " + x.hashCode());
        System.out.println("Brand of car X is " + y.type + ". Hashcode of x is " + y.hashCode());
        System.out.println("Brand of car X is " + z.type + ". Hashcode of x is " + z.hashCode());

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
