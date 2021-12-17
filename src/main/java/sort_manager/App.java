package sort_manager;

import sort_manager.io_interface.Reader;

import java.util.logging.Level;

public class App {
    public static void main(String[] args) {
        GUI gui = new GUI();

        MyLogger.setLogLevel(Level.ALL);
        MyLogger.log(Level.INFO, "Program Started");

        //Start the program
        //(No longer used)
//        ProgramManager programManager = new ProgramManager();
//        programManager.run();
    }
}
