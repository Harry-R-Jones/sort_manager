package sort_manager;

import sort_manager.io_interface.Reader;

import java.util.logging.Level;

public class App {
    public static void main(String[] args) {

        MyLogger.setLogLevel(Level.ALL);
        MyLogger.log(Level.INFO, "Program Started");

        //Start the program
        ProgramManager programManager = new ProgramManager();
        programManager.run();
    }
}
