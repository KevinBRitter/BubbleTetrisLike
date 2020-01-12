import app.window.GamePlayWindow;

import javax.swing.*;

public class WindowTester {
    public static void main(String[] args) {
        // Instantiate a game window and invoke the create and show method within it
        GamePlayWindow app = new GamePlayWindow();
        SwingUtilities.invokeLater(app::createAndShowGUI);

    }
}
