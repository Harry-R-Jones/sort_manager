package sort_manager.sorting.subsorters.binarysort;

import sort_manager.sorting.Sorter;

public class BinarySort implements Sorter {
    private BinaryTree sortTree;

    public BinarySort(int[] unsortedInts) {
        //Create a binary tree using the first element as the root
        sortTree = new BinaryTree(unsortedInts[0]);

        //Add other elements as nodes
        for(int i = 1; i < unsortedInts.length; i++){
            sortTree.addElement(unsortedInts[i]);
        }

    }

    /**
     * "Sorting" method that returns the tree as an ordered array
     * @return int[] the ordered list of arrays
     */
    public int[] sort(){
        return sortTree.getSortedTreeAsc();
    }
}
