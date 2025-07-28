import SingletonPattern.DatabaseConnection;

public class SingletonPatternTest {
    public static void main(String[] args) {

        // Get the singleton instance
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect("jdbc:mysql://localhost:3306/products", "admin", 45);

        // Get another reference to the singleton
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Check values from second reference
        System.out.println("DB2 Connection URL: " + db2.getConnectionURL());
        System.out.println("DB2 Username: " + db2.getUsername());
        System.out.println("DB2 Is Connected: " + db2.isConnected());
        System.out.println("DB2 Timeout: " + db2.getTimeout());

        // Print hash codes to verify both are same instance
        System.out.println("HashCode of db1: " + db1.hashCode());
        System.out.println("HashCode of db2: " + db2.hashCode());

        if (db1 == db2) {
            System.out.println("Both references point to the same DatabaseConnection instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
