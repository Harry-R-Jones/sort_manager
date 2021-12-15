package sort_manager;

import sort_manager.io_interface.IOManager;
import sort_manager.sorting.SortManager;

public class ProgramManager {
    IOManager ioManager;
    SortManager sortManager;
    int[] unsortedArray;

    public ProgramManager(){
        ioManager = new IOManager();
        sortManager = createSortManager();
    }

    public void run(){
        ioManager.writeArray(getUnsortedArray());

        sortManager.timedSort();

        ioManager.printOutputs(sortManager.getSortedArray(), sortManager.getAlgorithm(), sortManager.getTime());
    }

    private SortManager createSortManager() {
        String algorithm = getAlgorithm();
        int arraySize = ioManager.getNumber();

        setUnsortedArray(RandomArrayGenerator.generate(arraySize));

        sortManager = new SortManager(algorithm, unsortedArray);

        return sortManager;
    }

    private void setUnsortedArray(int[] generatedArray) {
        unsortedArray = generatedArray;
    }

    private int[] getUnsortedArray(){
        return unsortedArray;
    }

    private String getAlgorithm() {
        String algorithm;
        do {
            algorithm = ioManager.getAlgorithm();
        } while(algorithm.equals("Invalid"));

        return algorithm;
    }
}
