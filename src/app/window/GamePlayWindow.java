package app.window;

import javax.swing.*;
import java.awt.*;

public class GamePlayWindow {
    private JPanel OuterJPanel;
    private JButton ButtonForSizeTest;

    public GamePlayWindow() {
        // generic lambda action listener calls this print statement for demonstrating functionality
        ButtonForSizeTest.addActionListener(e -> System.out.println("Test Button Pressed!"));
    }

    public void createAndShowGUI() {
        // near minimum code to generate and show a one button application of arbitrary size
        JFrame frame = new JFrame("Title Goes Here");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(OuterJPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
