package sort_manager.sorting.subsorters;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

public class BubbleSortTest {
    int[] unsorted;
    int[] sorted;
    BubbleSort bubbleSort;

    @BeforeAll
    static void setupAll(TestInfo testinfo){
        System.out.println(testinfo.getTestClass() + " executing");
    }

    @BeforeEach
//    @ValueSource(ints = {12, 78, 21, -1000, 9})
    void setup(TestInfo testInfo) {
        unsorted = new int[]{12, 78, 21, -1000, 9};
        sorted= new int[]{-1000, 9, 12, 21, 78};

        bubbleSort = new BubbleSort(unsorted);
        System.out.println(testInfo.getDisplayName() + " - is being tested");

    }

    @Test
    @DisplayName("Test array gets sorted")
    void testArrayGetsSorted() {
        Assertions.assertArrayEquals(sorted, bubbleSort.sort());
    }

}