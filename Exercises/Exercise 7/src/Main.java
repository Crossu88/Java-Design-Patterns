public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.logInfo("Testing a logged message");

        logger.logWarning("Testing a warning message");

        logger.logError("Testing an error message");
    }
}
