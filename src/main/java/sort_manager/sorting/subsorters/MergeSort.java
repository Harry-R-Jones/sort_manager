package sort_manager.sorting.subsorters;

import sort_manager.sorting.Sorter;

import java.util.Arrays;

public class MergeSort extends Sorter {
    private int[] unsortedInts;

    public MergeSort(int[] unsortedInts){
        this.unsortedInts = unsortedInts;
    }

    /**
     * Method to sort using the inbuilt mergeSort algorithm
     * @return int[] the sorted array
     */
    public int[] sort() {

        Arrays.sort(unsortedInts);
        return unsortedInts;
    }
}
