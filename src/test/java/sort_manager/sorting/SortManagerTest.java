package sort_manager.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class SortManagerTest {
static SortManager sortManager;

    @BeforeAll
    static void setupAll(){
        int[] nums = {4,12,3};
        sortManager = new SortManager("Bubble", nums);
        sortManager.timedSort();
    }


    @Test
    @DisplayName("Test that time is calculated")
    void testThatTimeIsCalculated() {
        Assertions.assertTrue(sortManager.getTime() > 0);
    }

    @Test
    @DisplayName("Test that the algorithm is right")
    void testThatTheAlgorithmIsRight() {
        Assertions.assertEquals("Bubble", sortManager.getAlgorithm());
    }

    @Test
    @DisplayName("Check that the array gets sorted correctly")
    void checkThatTheArrayGetsSortedCorrectly() {
        int[] sortedInts = {3,4,12};
        Assertions.assertArrayEquals(sortedInts, sortManager.getSortedArray());
    }
}
