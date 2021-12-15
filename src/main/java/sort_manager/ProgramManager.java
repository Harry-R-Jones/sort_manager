package sort_manager;

import sort_manager.io_interface.IOManager;
import sort_manager.sorting.SortManager;

public class ProgramManager {
    IOManager ioManager;
    SortManager sortManager;
    int[] unsortedArray;

    public ProgramManager(){
        //Create ioManager to handle reading and writing
        ioManager = new IOManager();

        //Create sortManager to handle sorting
        sortManager = createSortManager();
    }

    /**
     * Main body of the program
     */
    public void run(){

        ioManager.writeArray(getUnsortedArray());

        sortManager.timedSort();

        ioManager.printOutputs(sortManager.getSortedArray(), sortManager.getAlgorithm(), sortManager.getTime());
    }

    /**
     * Get the user inputs and make a sortmanager with them
     * @return a sortmanager with inputs
     */
    private SortManager createSortManager() {
        String algorithm = getAlgorithm();
        int arraySize = ioManager.getNumber();

        setUnsortedArray(RandomArrayGenerator.generate(arraySize));

        sortManager = new SortManager(algorithm, unsortedArray);

        return sortManager;
    }

    /**
     * getters and setters
     */
    private void setUnsortedArray(int[] generatedArray) {
        unsortedArray = generatedArray;
    }

    private int[] getUnsortedArray(){
        return unsortedArray;
    }

    /**
     * Method to ask the user for an algorithm to use, rejecting invalid answers and repeating
     * @return String the algorithm to use
     */
    private String getAlgorithm() {
        String algorithm;
        do {
            algorithm = ioManager.getAlgorithm();
        } while(algorithm.equals("Invalid"));

        return algorithm;
    }
}
