package sort_manager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    static Logger logger = Logger.getLogger("myLogger");

    public static void log(Level level, String msg) {
        logger.log(level, msg);
    }

    public static void setLogLevel(Level level) {
        logger.setLevel(level);
    }
}
