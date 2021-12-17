package sort_manager;

import sort_manager.sorting.SortManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;

public class GUI implements ActionListener {
    ButtonGroup algorithmButtons;
    JRadioButton radioButtonBinary = new JRadioButton();
    JRadioButton radioButtonBubble = new JRadioButton();
    JRadioButton radioButtonMerge = new JRadioButton();
    JTextField arraySizeText;
    JFrame frame;
    JTextArea unsortedArrayLabel = new JTextArea(10,120);
    JLabel timeTakenLabel = new JLabel();
    JTextArea sortedArrayLabel = new JTextArea(10,120);

    int[] random;

    SortManager sortManager;


    public GUI(){
        frame = new JFrame();
        JPanel panel = new JPanel();

        algorithmButtons = getButtons();

        arraySizeText = new JTextField("How many ints?");
        arraySizeText.setColumns(25);

        JButton button = new JButton("Generate and sort");
        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(new FlowLayout());

        timeTakenLabel.setText("^ Unsorted Array, Sorted Array v");

        panel.add(arraySizeText);
        panel.add(radioButtonBinary);
        panel.add(radioButtonBubble);
        panel.add(radioButtonMerge);
        panel.add(button);

        unsortedArrayLabel.setLineWrap(true);
        sortedArrayLabel.setLineWrap(true);

        panel.add(unsortedArrayLabel);
        panel.add(timeTakenLabel);
        panel.add(sortedArrayLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Sortatron 5000");
        frame.pack();
        frame.setVisible(true);

        MyLogger.log(Level.FINE,"GUI Loaded");
    }

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

    @Override
    public void actionPerformed(ActionEvent e) {

        int arraySize = -1;

        try {
            arraySize = Integer.parseInt(arraySizeText.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "You must input an integer :(");
        }

        resolveAlgorithm(arraySize);

    }

    private void resolveAlgorithm(int arraySize) {
        if(arraySize > 0) {
            random = RandomArrayGenerator.generate(arraySize);

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

            unsortedArrayLabel.setText(Arrays.toString(sortManager.getUnsortedArray()));
            timeTakenLabel.setText("was Sorted in: " + sortManager.getTime() + " nanoseconds to give ");
            sortedArrayLabel.setText(Arrays.toString(sortManager.getSortedArray()));
        }
    }
}
