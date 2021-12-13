package sort_manager.sorting;

public class SortManager {
    private String algorithm;
    private int[] unsortedArray;
    private long timeInNanoSecs;
    private Sorter sorter;

    public SortManager(String algorithm, int[] unsortedArray) {
        this.algorithm = algorithm;
        this.unsortedArray = unsortedArray;
        sorter = SorterFactory.getSorter(algorithm, unsortedArray);

    }

    public int[] timedSort(){

        Long startTime = System.nanoTime();

        int[] sortedArray = sort(unsortedArray, algorithm);

        Long endTime = System.nanoTime();

        timeInNanoSecs = endTime - startTime;

        return sortedArray;
    }

    public int[] sort(int[] unsortedArray, String algorithm){
        int[] sortedArray = new int[unsortedArray.length];


    return null;
    }
}
