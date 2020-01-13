package app.window;

import javax.swing.*;
import java.awt.*;

public class GamePlayWindow {
    private JPanel JPanelGamePlay;
    private JPanel JPanelShapesNext;
    private JPanel JPanelCanvasMain;
    private JPanel JPanelScores;
    private JPanel JPanelShapes;
    private JPanel JPanelNextShape;
    private JTextArea JTextAreaScoresList;

    public GamePlayWindow() {
        ImageIcon icon = null;
        Image image;
        icon = new ImageIcon(getClass().getResource("/images/raw_blue.png"));
        image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon box = new ImageIcon(image);
//        JPanelCanvasMain.add(box);
    }

    public void createAndShowGUI() {
        // Displays the game window
        JFrame frame = new JFrame("TETROS BUBBLES");
        frame.setMinimumSize(new Dimension(660, 960));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(JPanelGamePlay);

        frame.pack();
        frame.setVisible(true);
    }
}
