package singleton.external;

import java.util.Objects;

public class Logger {
    static private Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (Objects.isNull(logger)) {
            synchronized (Thread.currentThread()) {
                if (Objects.isNull(logger)) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void logMessage(String message) {
        System.out.println(message);
    }
}
