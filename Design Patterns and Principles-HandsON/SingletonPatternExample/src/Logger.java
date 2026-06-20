public class Logger {
    // 2. Define a Singleton Class: private static instance of itself
    private static Logger instance;

    // Ensure the constructor of Logger is private
    private Logger() {
        // Private constructor to prevent instantiation from outside
    }

    // Provide a public static method to get the instance of the Logger class
    public static Logger getInstance() {
        // 3. Implement the Singleton Pattern: ensure single instance
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // A sample method to demonstrate logging functionality
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
