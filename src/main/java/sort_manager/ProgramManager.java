package sort_manager;

import sort_manager.io_interface.IOManager;
import sort_manager.sorting.SortManager;

public class ProgramManager {
    IOManager ioManager;
    public ProgramManager(){
        ioManager = new IOManager();
    }

    public void run(){
        String algorithm = getAlgorithm();
        int arraySize = getNumber();


        SortManager sortManager = new SortManager(algorithm, RandomArrayGenerator.generate(arraySize));
        sortManager.timedSort();
    }

    public String getAlgorithm(){
        ioManager.getWriter().askAlgorithm();
        return ioManager.getReader().getAlgorithm();
    }

    public int getNumber(){
        ioManager.getWriter().askNumber();
        return ioManager.getReader().getNumber();
    }

}
