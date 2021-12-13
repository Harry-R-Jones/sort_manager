package sort_manager.io_interface;

import java.util.Scanner;

public class Reader {
    Scanner scan = new Scanner(System.in);

    public int getNumber(){
        return scan.nextInt();
    }

    public String getAlgorithm(){
        String inputString = scan.next();
        return checkValid(inputString);
    }

    private String checkValid(String inputString) {
        if(isValid(inputString)){
            return inputString;
        } else {
            return "Invalid";
        }
    }

    public boolean isValid(String candidateString){
        boolean isValid = false;
        String[] algorithms = {"Binary", "Bubble", "Merge"};
        for (String algorithm : algorithms) {
            if(candidateString.equals(algorithm)){
                isValid = true;
                break;
            }
        }

        return isValid;
    }
}
