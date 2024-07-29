/// Singleton Class
class Logger {
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {}

    // Method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

// Main
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");

        // Check if both logger1 and logger2 are the same instance
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
}
