package sort_manager;

import sort_manager.io_interface.IOManager;
import sort_manager.sorting.SortManager;

public class ProgramManager {
    IOManager ioManager;

    public ProgramManager(){
        ioManager = new IOManager();
    }

    public void run(){
        String algorithm;

        do {
            algorithm = ioManager.getAlgorithm();
        } while(algorithm.equals("Invalid"));

        int arraySize = ioManager.getNumber();

        SortManager sortManager = new SortManager(algorithm, RandomArrayGenerator.generate(arraySize));
        sortManager.timedSort();
    }
}
