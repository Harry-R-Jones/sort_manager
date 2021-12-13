package sort_manager.sorting.subsorters.binarysort;

import sort_manager.sorting.Sorter;

public class BinarySort extends Sorter {
    private BinaryTree sortTree;

    public BinarySort(int[] unsortedInts) {
        sortTree = new BinaryTree(unsortedInts[0]);

        for(int i = 1; i < unsortedInts.length; i++){
            sortTree.addElement(unsortedInts[i]);
        }

    }

    public int[] sort(){
        return sortTree.getSortedTreeAsc();
    }
}
