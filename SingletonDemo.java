public class SingletonDemo {
    public static void main(String[] args) {
        // Retrieves the singleton instance of Logger
        Logger logger1 = Logger.getInstance();
        // Retrieves the singleton instance again to demonstrate that it returns the same instance
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a log message.");
        logger2.log("This is another log message.");

        // Checks if both references point to the same instance, which should print `true`
        System.out.println(logger1 == logger2); // Should print true
    }
}
