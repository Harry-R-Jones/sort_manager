package sort_manager.sorting.subsorters.binarysort;

/**
 * Class to represent Nodes in a BinaryTree
 */
public class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty(){
        return leftChild == null;
    }

    public boolean isRightChildEmpty(){
        return rightChild == null;
    }
}
