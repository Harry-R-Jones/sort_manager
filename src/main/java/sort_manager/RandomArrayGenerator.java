package sort_manager;

import java.util.Random;

public class RandomArrayGenerator {

    /**
     * Static method to generate a list of random ints
     * @param capacity the number of ints in the array
     * @return int[] the list of random ints
     */
    public static int[] generate(int capacity) {
        int[] randomArray = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            randomArray[i] = getRandom();
        }

        return randomArray;
    }

    /**
     * Method to get a single random int
     * @return int the random int
     */
    private static int getRandom(){
        Random random = new Random();
        return random.nextInt();
    }
}
