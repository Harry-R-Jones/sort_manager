package sort_manager.sorting.subsorters;

import sort_manager.sorting.Sorter;

public class BubbleSort implements Sorter {
    private int[] unsortedInts;

    public BubbleSort(int[] unsortedInts){
        this.unsortedInts = unsortedInts;
    }

    /**
     * method to sort an unordered array of ints
     * @return int[] the sorted array of ints
     */
    public int[] sort() {

        //Assume the array begins unsorted
        boolean sorted = false;

        //until sorted
        while (!sorted) {
            //Make a pass
            sorted = sortLoopOnce(unsortedInts);
        }

        //return the sorted array
        return unsortedInts;
    }

    /**
     * Method to handle a single loop through the list
     * @param unsortedInts the list of unsorted elements
     * @return boolean whether the list is now sorted
     */
    private boolean sortLoopOnce(int[] unsortedInts) {
        //No changes have been made on this pass
        boolean changes = false;

        //Walk through the array
        for (int j = 0; j < unsortedInts.length - 1; j++) {
            //compare with next integer
            if (unsortedInts[j] > unsortedInts[j + 1]) {
                //if current is larger

                //Swap the two ints
                int holder = unsortedInts[j];
                unsortedInts[j] = unsortedInts[j + 1];
                unsortedInts[j + 1] = holder;

                //Update to reflect that changes have been made this pass
                changes = true;
            }

        }

        //if no changes were made to the array on this pass
        //The array has been sorted
        return !changes;
    }
}
