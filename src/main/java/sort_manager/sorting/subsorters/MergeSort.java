package sort_manager.sorting.subsorters;

import sort_manager.sorting.Sorter;


public class MergeSort implements Sorter {
    private final int[] unSortedInts;
    private int[] sortedInts;
    private int[] temporary;
    private int length;

    public MergeSort(int[] unsortedInts){
        this.unSortedInts = unsortedInts;
        sortedInts = unsortedInts;
    }

    /**
     * Method to sort using the inbuilt mergeSort algorithm
     * @return int[] the sorted array
     */
    public int[] sort() {

        length = sortedInts.length;
        temporary = new int[length];
        mergeSort(0, length - 1);

        return sortedInts;
    }

    private void mergeSort(int start, int end) {
        if (start < end) {
            //Find the middle of array
            int middle = start + (end - start) / 2;
            //sort the left
            mergeSort(start, middle);
            //Sort the right
            mergeSort(middle + 1, end);
            //Merge left and right
            merge(start, middle, end);
        }
    }

    private void merge(int low, int middle, int high) {
        // Copy both parts into temporary
        for (int i = low; i <= high; i++) {
            temporary[i] = sortedInts[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (temporary[i] <= temporary[j]) {
                sortedInts[k] = temporary[i];
                i++;
            } else {
                sortedInts[k] = temporary[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            sortedInts[k] = temporary[i];
            k++;
            i++;
        }
    }
}
