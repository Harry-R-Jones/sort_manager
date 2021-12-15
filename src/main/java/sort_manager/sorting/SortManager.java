package sort_manager.sorting;

public class SortManager {
    private String algorithm;
    private int[] unsortedArray;
    private int[] sortedArray;
    private long timeInNanoSecs;
    private Sorter sorter;

    //Constructor for SortManager
    public SortManager(String algorithm, int[] unsortedArray) {
        this.algorithm = algorithm;
        this.unsortedArray = unsortedArray;
        this.sortedArray = null;

        //Factory pattern from sorter
        sorter = SorterFactory.getSorter(algorithm, unsortedArray);

    }

    /**
     * Method to sort the unsorted array (stored as variable) and time how long it took
     */
    public void timedSort(){

        Long startTime = System.nanoTime();

        setSortedArray(sorter.sort());

        Long endTime = System.nanoTime();

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
        return unsortedArray;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public void setSortedArray(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }
}
