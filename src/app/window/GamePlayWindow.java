package app.window;

import javax.swing.*;
import java.awt.*;

public class GamePlayWindow {
    private JPanel OuterJPanel;
    private JPanel JPanelShapesNext;
    private JPanel JPanelCanvasMain;
    private JPanel JPanelScores;
    private JPanel JPanelShapes;
    private JPanel JPanelNextShape;
    private JTextArea JTextAreaScoresList;
    private JButton ButtonForSizeTest;

    public GamePlayWindow() {

    }

    public void createAndShowGUI() {
        // near minimum code to generate and show a one button application of arbitrary size
        JFrame frame = new JFrame("TETROS BUBBLES");
        frame.setMinimumSize(new Dimension(660, 960));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(OuterJPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
