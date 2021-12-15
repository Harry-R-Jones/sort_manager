package sort_manager.sorting;

import sort_manager.sorting.subsorters.binarysort.BinarySort;
import sort_manager.sorting.subsorters.BubbleSort;
import sort_manager.sorting.subsorters.MergeSort;

public class SorterFactory {
    public static Sorter getSorter(String algorithm, int[] unsortedArray) {
        return switch (algorithm) {
            case "Binary" -> new BinarySort(unsortedArray);
            case "Bubble" -> new BubbleSort(unsortedArray);
            case "Merge" -> new MergeSort(unsortedArray);
            default -> null;
        };
    }
}
