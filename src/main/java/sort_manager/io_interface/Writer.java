package sort_manager.io_interface;

import java.util.Arrays;

public class Writer {
    /**
     * Method to ask the user to pick a sorting algorithm
     */
    public void askAlgorithm(){
        System.out.println("Which Algorithm would you like to use?");
        System.out.println("The options are: ");
        System.out.println("Bubble");
        System.out.println("Binary");
        System.out.println("Merge");
    }

    /**
     * Method to ask the user to input an integer
     */
    public void askNumber(){
        System.out.println("Enter how many numbers you would like in the array. Type your answer as a numerical whole number (E.G 400)");
    }

    /**
     * Method to print an array in the format [n, n + 1, ....]
     * @param array the array to print
     */
    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Method to print a description of what we've done to the array and how long it took.
     * @param algorithm the algorithm we used
     * @param time the time taken in nanoseconds
     */
    public void printDescription(String algorithm, long time) {
        System.out.println("Was sorted using " + algorithm + " in " + time + " nanoseconds to give: ");
    }
}
