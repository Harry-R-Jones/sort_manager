package sort_manager;

import java.util.logging.Level;

public class App {
    public static void main(String[] args) {
        MyLogger.setLogLevel(Level.ALL);
        MyLogger.log(Level.INFO, "Program Started");

        MyLogger.log(Level.FINE, "creating GUI");
        GUI gui = new GUI();


    }
}
