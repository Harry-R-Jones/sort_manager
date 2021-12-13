package sort_manager.sorting.subsorters;

import sort_manager.sorting.Sorter;

public class BubbleSort extends Sorter {
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

            //No changes have been made on this pass
            boolean changes = false;

            //Make a pass
            sorted = sortLoopOnce(unsortedInts, sorted, changes);
        }

        //return the sorted array
        return unsortedInts;
    }

    private boolean sortLoopOnce(int[] unsortedInts, boolean sorted, boolean changes) {
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
        if (!changes) {
            //The array has been sorted
            sorted = true;
        }
        return sorted;
    }
}
