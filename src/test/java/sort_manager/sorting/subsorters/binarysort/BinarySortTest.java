package sort_manager.sorting.subsorters.binarysort;

import org.junit.jupiter.api.*;
import sort_manager.sorting.subsorters.binarysort.BinarySort;

public class BinarySortTest {
    int[] unsorted;
    int[] sorted;
    BinarySort binarySort;

    @BeforeAll
    static void setupAll(TestInfo testinfo){
        System.out.println(testinfo.getTestClass() + " executing");
    }

    @BeforeEach
//    @ValueSource(ints = {12, 78, 21, -1000, 9})
    void setup(TestInfo testInfo) {
        unsorted = new int[]{12, 78, 21, -1000, 9};
        sorted= new int[]{-1000, 9, 12, 21, 78};

        binarySort = new BinarySort(unsorted);
        System.out.println(testInfo.getDisplayName() + " - is being tested");

    }

    @Test
    @DisplayName("Test array gets sorted")
    void testArrayGetsSorted() {
        Assertions.assertArrayEquals(sorted, binarySort.sort());
    }


}
