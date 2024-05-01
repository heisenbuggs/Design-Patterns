import SingletonPattern.Pizza;

public class SingletonPatternTest {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Pizza x = Pizza.getInstance();

        // Instantiating Singleton class with variable y
        Pizza y = Pizza.getInstance();

        // Instantiating Singleton class with variable z
        Pizza z = Pizza.getInstance();

        x.setType("Farmhouse Pizza");

        // Printing the hash code for above variable as
        // declared
        System.out.println("Type of pizza X is " + x.getType() + ". Hashcode of x is " + x.hashCode());
        System.out.println("Type of pizza Y is " + y.getType() + ". Hashcode of y is " + y.hashCode());
        System.out.println("Type of pizza Z is " + z.getType() + ". Hashcode of z is " + z.hashCode());

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
