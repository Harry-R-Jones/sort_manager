package sort_manager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
    static Logger logger = Logger.getLogger("myLogger");

    /**
     * Method to log a message
     * @param level The level of the message
     * @param msg The message to be logged
     */
    public static void log(Level level, String msg) {
        logger.log(level, msg);
    }

    /**
     * Method to set the logging floor. log messages at a level below this will be ignored
     * @param level all levels below this are ignored
     */
    public static void setLogLevel(Level level) {
        logger.setLevel(level);
    }
}
