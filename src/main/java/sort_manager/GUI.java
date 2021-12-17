package sort_manager;

import sort_manager.sorting.SortManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;

public class GUI implements ActionListener {

    //The buttongroup for selecting which algorithm to use
    ButtonGroup algorithmButtons;
    JRadioButton radioButtonBinary = new JRadioButton();
    JRadioButton radioButtonBubble = new JRadioButton();
    JRadioButton radioButtonMerge = new JRadioButton();

    //how big will the array be
    JTextField arraySizeText;
    JFrame frame;

    //Unsorted array, time taken, sorted array text areas
    JTextArea unsortedArrayLabel = new JTextArea(10,120);
    JLabel timeTakenLabel = new JLabel();
    JTextArea sortedArrayLabel = new JTextArea(10,120);

    //The random array
    int[] random;

    SortManager sortManager;


    public GUI(){
        //Make a frame and panel
        frame = new JFrame();
        JPanel panel = new JPanel();

        //Get the buttons from a separate method
        algorithmButtons = getButtons();

        //Set text to ask for output
        arraySizeText = new JTextField("How many ints?");
        arraySizeText.setColumns(25);

        JButton button = new JButton("Generate and sort");
        button.addActionListener(this);

        //Formatting
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(new FlowLayout());

        timeTakenLabel.setText("^ Unsorted Array, Sorted Array v");

        unsortedArrayLabel.setLineWrap(true);
        sortedArrayLabel.setLineWrap(true);

        //Add all to panel
        panel.add(arraySizeText);
        panel.add(radioButtonBinary);
        panel.add(radioButtonBubble);
        panel.add(radioButtonMerge);
        panel.add(button);
        panel.add(unsortedArrayLabel);
        panel.add(timeTakenLabel);
        panel.add(sortedArrayLabel);

        //Add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Sortatron 5000");
        frame.pack();
        frame.setVisible(true);

        MyLogger.log(Level.FINE,"GUI Loaded");
    }

    /**
     * Method to create the group of buttons to select one algorithm
     * @return The group of radio buttons for the algorithms
     */
    private ButtonGroup getButtons() {
        ButtonGroup buttons = new ButtonGroup();

        radioButtonMerge.setText("Merge sort");
        radioButtonBinary.setText("Binary sort");
        radioButtonBubble.setText("Bubble sort");

        buttons.add(radioButtonBinary);
        buttons.add(radioButtonBubble);
        buttons.add(radioButtonMerge);

        return buttons;
    }

    /**
     * On button click
     * @param e Button Click event
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        //Make value unreasonable
        int arraySize = -1;

        try {
            //If we get a number input make it a string
            arraySize = Integer.parseInt(arraySizeText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "You must input an integer :(");
        }

        //When arraysize is a possible value (positive integer)
        if(arraySize > 0 && aButtonChecked()) {
            //Make the array and sort
            resolveAlgorithm(arraySize);
        }

    }

    private boolean aButtonChecked() {
        boolean buttonChecked = false;
        if(algorithmButtons.isSelected(radioButtonBinary.getModel())) {
            buttonChecked = true;
        }
        if(algorithmButtons.isSelected(radioButtonBubble.getModel())) {
            buttonChecked = true;
        }
        if(algorithmButtons.isSelected(radioButtonMerge.getModel())) {
            buttonChecked = true;
        }

        if(!buttonChecked) {
            JOptionPane.showMessageDialog(frame, "You must select an algorithm to use :(");
        }

        return buttonChecked;
    }

    /**
     * Method to resolve the sort
     * @param arraySize the size of array to generate
     */
    private void resolveAlgorithm(int arraySize) {

        //Make array
        random = RandomArrayGenerator.generate(arraySize);

        //Get which button is selected
        if (algorithmButtons.isSelected(radioButtonBinary.getModel())) {
            sortManager = new SortManager("Binary", random);
            MyLogger.log(Level.FINER, "Binary sort selected");
        } else if (algorithmButtons.isSelected(radioButtonBubble.getModel())) {
            sortManager = new SortManager("Bubble", random);
            MyLogger.log(Level.FINER, "Bubble sort selected");
        } else if (algorithmButtons.isSelected(radioButtonMerge.getModel())) {
            sortManager = new SortManager("Merge", random);
            MyLogger.log(Level.FINER, "Merge sort selected");
        }

        sortManager.timedSort();

        //Output arrays and time to their text areas and the label
        unsortedArrayLabel.setText(Arrays.toString(sortManager.getUnsortedArray()));
        timeTakenLabel.setText("was Sorted in: " + sortManager.getTime() + " nanoseconds to give ");
        sortedArrayLabel.setText(Arrays.toString(sortManager.getSortedArray()));
    }
}
