public class Logger {
    
    // Private static instance of the same class, this is the only instance
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize the log file, for example
        System.out.println("Initializing log file...");
    }
    
    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { // Ensure thread safety
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Method to log a message
    public void log(String message) {
        // Here you would append the message to the log file
        System.out.println("Logging message: " + message);
    }
}


