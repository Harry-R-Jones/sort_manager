package sort_manager.sorting;

import sort_manager.sorting.subsorters.BinarySort;
import sort_manager.sorting.subsorters.BubbleSort;
import sort_manager.sorting.subsorters.MergeSort;

public class SorterFactory {
    public static Sorter getSorter(String algorithm) {
        return switch (algorithm) {
            case "Binary" -> new BinarySort();
            case "Bubble" -> new BubbleSort();
            case "Merge" -> new MergeSort();
            default -> null;
        };
    }
}
