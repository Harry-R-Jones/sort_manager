package sort_manager.sorting.subsorters;

import sort_manager.sorting.Sorter;

import java.util.Arrays;

public class MergeSort extends Sorter {

    /**
     * Method to sort using the inbuilt mergeSort algorithm
     * @param unsortedArray the array to be sorted
     * @return int[] the sorted array
     */
    public int[] sort(int[] unsortedArray) {

        Arrays.sort(unsortedArray);
        return unsortedArray;
    }
}
