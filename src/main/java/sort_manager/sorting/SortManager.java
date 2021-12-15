package sort_manager.sorting;

public class SortManager {
    private String algorithm;
    private int[] unsortedArray;
    private int[] sortedArray;
    private long timeInNanoSecs;
    private Sorter sorter;

    public SortManager(String algorithm, int[] unsortedArray) {
        this.algorithm = algorithm;
        this.unsortedArray = unsortedArray;
        this.sortedArray = null;
        sorter = SorterFactory.getSorter(algorithm, unsortedArray);

    }

    public void timedSort(){

        Long startTime = System.nanoTime();

        setSortedArray(sorter.sort());

        Long endTime = System.nanoTime();

        timeInNanoSecs = endTime - startTime;
    }

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
