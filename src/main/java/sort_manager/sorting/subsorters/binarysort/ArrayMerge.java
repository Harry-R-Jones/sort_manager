package sort_manager.sorting.subsorters.binarysort;

//import challenges.Week2.BubbleSort.BubbleSort;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayMerge {

    /**
     * method to combine the elements of two arrays into a single array
     * @param arr1 The first array to be merged
     * @param arr2 The second array to be merged
     * @return The combined int array
     */
    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        //Find the total number of elements
        int totalSize = arr1.length + arr2.length;
        //Create an array of that size
        int[] mergedArr = new int[totalSize];

        //Add the first array's elements
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);

        //Add the second array's elements at an offset index
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);

        return mergedArr;
    }

//    /**
//     * method to sort an int array into ascending order
//     * @param unsortedInts the ints to be sorted
//     * @return an array of sorted ints
//     */
//    public static int[] sortAscending(int[] unsortedInts){
//        //Using the bubbleSort method
//        return BubbleSort.bubbleSort(unsortedInts);
//    }

//    /**
//     * method to sort an int array into descending order
//     * @param unsortedInts the ints to be sorted
//     * @return an array of sorted ints
//     */
//    public static int[] sortDescending(int[] unsortedInts){
//        //using both bubbleSort and reversOrder methods
//        return reverseOrder(sortAscending(unsortedInts));
//    }

    /**
     * method to revers the order of elements in an array
     * @param oldOrder the order to be flipped
     * @return an int array with elements in reverse order
     */
    public static int[] reverseOrder(int[] oldOrder){
        //create an array of the same length
        int[] newOrder = new int[oldOrder.length];

        //initialise a counter to count from the last element backwards
        int counter = newOrder.length-1;

        for (int i = 0; i < oldOrder.length; i++) {
            //using the counter, walk backwards through the array adding elements to the new one in reverse order
            newOrder[i] = oldOrder[counter];
            counter--;
        }
        return newOrder;
    }

    /**
     * Method to remove duplicates from an int array
     * @param duplicateArray The array to removeduplicates from
     * @return an int array of the same elements but without duplicates
     */
    public static int[] removeDuplicates(int[] duplicateArray){

        //Create a HashSet to store unique values, Linked to preserve the insertion order
        Set<Integer> hashSet = new LinkedHashSet<>();

        //Add the elements from the array to the LinkedHashSet (duplicates are removed automatically)
        for(int n : duplicateArray){
            hashSet.add(n);
        }

        //Iterate through the hashset
        Iterator<Integer> it = hashSet.iterator();

        //Counter to store our index
        int counter = 0;

        //initialise a new array of the correct size
        int[] newArr = new int[hashSet.size()];

        while(it.hasNext()){
            //Add hashset elements at incrementing indexes
            newArr[counter] = it.next();
            counter++;
        }
        return newArr;
    }




}
