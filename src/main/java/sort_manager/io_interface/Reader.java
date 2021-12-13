package sort_manager.io_interface;

import java.nio.channels.ScatteringByteChannel;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Reader {
    Scanner scan = new Scanner(System.in);

    /**
     * Method to return the users input string as an integer
     * @return int the size of an array
     */
    public int getNumber() {

        //Start with invalid responses
        String arraySizeString;
        int arraySize;


        try {

            //Try to get user input (throws NoSuchElementException if user inputs nothing)
            arraySizeString = scan.next();

            //Try to parse an integer from a String (throws NumberFormatException if String isn't an integer)
            arraySize = Integer.parseInt(arraySizeString);

        } catch (NumberFormatException e) {
            //Inform user what they did wrong
            System.out.println("That wasn't an integer!");
            return -1;
        } catch (NoSuchElementException e) {
            //Inform user what they did wrong
            System.out.println("Type something!");
            return -1;
        }
        return arraySize;
    }

    /**
     * Method to get a User's string input and check that it is one of our sorting algorithms
     * @return String The name of an algorithm or Invalid if the input was not a name
     */
    public String getAlgorithm(){
        //Start with blank String
        String inputString = "";

        try {
            //Get user input
            inputString = scan.next();
        } catch (NoSuchElementException e) {
            //Tell user what went wrong
            e.printStackTrace();
        }

        //If input was valid
        if(isValid(inputString)){
            return inputString;
        } else {
            //Invalid denotes wrong input
            return "Invalid";
        }
    }

    /**
     * private method to check validity of user input
     * @param candidateString the String to check
     * @return boolean whether or not the input was valid
     */
    private boolean isValid(String candidateString){
        //Assume invalid
        boolean isValid = false;

        //Might make this a nested Enum
        String[] algorithms = {"Binary", "Bubble", "Merge"};

        //Check candidate against each possilble algorithm
        for (String algorithm : algorithms) {
            if(candidateString.equals(algorithm)){
                //If we match, then the user input is a valid algorithm
                isValid = true;
                break;
            }
        }

        return isValid;
    }
}
