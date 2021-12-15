package sort_manager.io_interface;

public class IOManager {
    private Reader reader = new Reader();
    private Writer writer = new Writer();


    public IOManager(){

    }

    /**
     * Method to get a valid number for the array size, can only be a positive whole number
     * @return int - The size of array we will be generating and sorting
     */
    public int getNumber(){

        //StartInvalid
        int arraySize = -1;

        //While not valid, ask for valid
        while(!validate(arraySize)) {
            writer.askNumber();
            arraySize = reader.getNumber();
        }
        return arraySize;
    }

    /**
     * Private method to determine whether or not an integer is a valid size for an array
     * @param candidate the number to check
     * @return boolean - whether or not the number is a valid size for an array
     */
    private boolean validate(int candidate){
        return candidate > 0;
    }

    /**
     * Method to ask for which algorithm to use and return the User's input
     * @return String the algorithm to use
     */
    public String getAlgorithm(){
        writer.askAlgorithm();
        return reader.getAlgorithm();
    }

    public void writeArray(int[] array){
        writer.printArray(array);
    }

    public void printOutputs( int[] sortedArray, String algorithm, long time) {
        writer.printDescription(algorithm, time);
        writer.printArray(sortedArray);
    }
}
