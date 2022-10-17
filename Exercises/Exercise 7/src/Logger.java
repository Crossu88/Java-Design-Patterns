import java.io.*;

public class Logger {
    private volatile static Logger instance = null;

    FileWriter writer = null;

    private Logger() throws IOException {
        writer = new FileWriter("log.txt");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    try {
                        instance = new Logger();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        return instance;
    }

    public void logError(String message) {
        log("ERROR: " + message);
    }

    public void logWarning(String message) {
        log("WARNING: " + message);
    }

    public void logInfo(String message) {
        log("INFO: " + message);
    }

    private void log(String message) {
        System.out.println(message);

        try {
            writer.write(message + '\n');
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
