package sort_manager.sorting.subsorters.binarysort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BinaryTreeTest {
    static BinaryTree bt;

    @BeforeAll
    static void setupAll(){
        bt = new BinaryTree(50);
        bt.addElement(12);
        bt.addElement(99);
        bt.addElement(31);
        bt.addElement(59);
    }

    @Test
    @DisplayName("Check tree is in ascending order")
    void checkTreeIsInAscendingOrder() {
        int[] sorted = {12,31,50,59,99};
        assertArrayEquals(sorted, bt.getSortedTreeAsc());
    }


}
