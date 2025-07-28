package SingletonPattern;

/**
 * Singleton class for managing database connections.
 */
public class DatabaseConnection {

    // Static variable for the single instance
    private static DatabaseConnection instance = null;

    // Attributes
    private String connectionURL;
    private String username;
    private boolean isConnected;
    private int timeout;

    // Private constructor
    private DatabaseConnection() {
        // Set some default values
        this.connectionURL = "jdbc:mysql://localhost:3306/default";
        this.username = "root";
        this.isConnected = false;
        this.timeout = 30;
        System.out.println("DatabaseConnection initialized.");
    }

    // Public method to provide access to the instance
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Simulate connect method
    public void connect(String url, String username, int timeout) {
        this.connectionURL = url;
        this.username = username;
        this.timeout = timeout;
        this.isConnected = true;
        System.out.println("Connected to DB at " + connectionURL + " as user " + username);
    }

    public void disconnect() {
        this.isConnected = false;
        System.out.println("Disconnected from database.");
    }

    // Getters
    public String getConnectionURL() {
        return connectionURL;
    }

    public String getUsername() {
        return username;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public int getTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
            "connectionURL='" + connectionURL + '\'' +
            ", username='" + username + '\'' +
            ", isConnected=" + isConnected +
            ", timeout=" + timeout +
            '}';
    }
}