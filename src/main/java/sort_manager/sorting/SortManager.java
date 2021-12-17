package sort_manager.sorting;

import sort_manager.MyLogger;

import java.util.logging.Level;

public class SortManager {
    private String algorithm;
    private final int[] UNSORTED_ARRAY;
    private int[] sortedArray;
    private long timeInNanoSecs;
    private Sorter sorter;

    public SortManager(String algorithm, int[] unsortedArray) {
        this.algorithm = algorithm;
        this.UNSORTED_ARRAY = unsortedArray;
        sortedArray = new int[unsortedArray.length];
        for (int i = 0; i < UNSORTED_ARRAY.length; i++) {
            sortedArray[i] = UNSORTED_ARRAY[i];
        }



        this.sortedArray = null;

        //Factory pattern from sorter
        sorter = SorterFactory.getSorter(algorithm, unsortedArray);

    }

    /**
     * Method to sort the unsorted array (stored as variable) and time how long it took
     */
    public void timedSort(){

        MyLogger.log(Level.INFO, "Starting Timer");
        Long startTime = System.nanoTime();

        setSortedArray(sorter.sort());

        Long endTime = System.nanoTime();
        MyLogger.log(Level.INFO, "Stopped Timer");

        timeInNanoSecs = endTime - startTime;
    }

    //Getters and Setters

    public long getTime() {
        return timeInNanoSecs;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public int[] getUnsortedArray() {
        return UNSORTED_ARRAY;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }
}
