package sort_manager.sorting.subsorters.binarysort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ArrayMergeTest {
    static int[] first;
    static int[] second;

    @BeforeAll
    static void setupAll(){
        first = new int[]{1, 2, 3};
        second = new int[]{4,5,6};
    }

    @Test
    @DisplayName("Check merged array is the right length")
    void checkMergedArrayIsTheRightLength() {
        Assertions.assertEquals(6, ArrayMerge.mergeTwoArrays(first,second).length);
    }

    @Test
    @DisplayName("check array is merged properly")
    void checkArrayIsMergedProperly() {
        int[] sorted = {1,2,3,4,5,6};
        Assertions.assertArrayEquals(sorted, ArrayMerge.mergeTwoArrays(first,second));
    }
}
