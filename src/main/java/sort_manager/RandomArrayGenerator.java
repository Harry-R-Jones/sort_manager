package sort_manager;

import java.util.Random;

public class RandomArrayGenerator {

    public static int[] generate(int capacity) {
        int[] randomArray = new int[capacity];

        for (int i = 0; i < capacity; i++) {
            randomArray[i] = getRandom();
        }

        return randomArray;
    }

    private static int getRandom(){
        Random random = new Random();
        return random.nextInt(1000);
    }
}
