package sort_manager.sorting;

import sort_manager.sorting.subsorters.BinarySort;
import sort_manager.sorting.subsorters.BubbleSort;

import java.time.LocalDateTime;

public class SortManager {
    private String algorithm;
    private int[] unsortedArray;
    private long timeInNanoSecs;

    public SortManager(String algorithm, int[] unsortedArray) {
        this.algorithm = algorithm;
        this.unsortedArray = unsortedArray;

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

//                Sorter sorter = new Sorter(algorithm);
    return null;
    }
}
