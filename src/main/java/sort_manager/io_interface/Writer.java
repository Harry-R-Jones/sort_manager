package sort_manager.io_interface;

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
}
