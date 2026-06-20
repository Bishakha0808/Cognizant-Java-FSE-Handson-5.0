public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("--- Testing Singleton Pattern ---");
        
        // 4. Test the Singleton Implementation
        // Verify that only one instance of Logger is created and used across the application.
        
        // Retrieve two instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Use the logger instances to print messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        
        // Check if both references point to the exact same object in memory
        if (logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 refer to the exact same instance.");
        } else {
            System.out.println("Failure: logger1 and logger2 refer to different instances.");
        }
    }
}
