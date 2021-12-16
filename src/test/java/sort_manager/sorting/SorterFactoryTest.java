package sort_manager.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sort_manager.sorting.subsorters.BubbleSort;
import sort_manager.sorting.subsorters.MergeSort;
import sort_manager.sorting.subsorters.binarysort.BinarySort;

public class SorterFactoryTest {
    static Sorter sorterBubble;
    static Sorter sorterBinary;
    static Sorter sorterMerge;
    static int[] dummy;

    @BeforeAll
    static void setupAll() {
        dummy = new int[]{1,2,3};
        sorterBubble = SorterFactory.getSorter("Bubble", dummy);
        sorterBinary = SorterFactory.getSorter("Binary", dummy);
        sorterMerge = SorterFactory.getSorter("Merge", dummy);

    }

    @Test
    @DisplayName("Check the sorter is the correct type Bubble")
    void checkTheSorterIsTheCorrectTypeBub() {
        BubbleSort bub = new BubbleSort(dummy);
        Assertions.assertEquals(sorterBubble.getClass(),bub.getClass());
    }

    @Test
    @DisplayName("Check the sorter is the correct type Binary")
    void checkTheSorterIsTheCorrectTypeBin() {
        BinarySort bin = new BinarySort(dummy);
        Assertions.assertEquals(sorterBinary.getClass(),bin.getClass());
    }

    @Test
    @DisplayName("Check the sorter is the correct type Merge")
    void checkTheSorterIsTheCorrectTypeMrg() {
        MergeSort mrg = new MergeSort(dummy);
        Assertions.assertEquals(sorterMerge.getClass(),mrg.getClass());
    }
}
