package inventory_system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


//TODO 1: Class to handle the exiting of the application.

public class Quit {

    private JFrame frame;

    public void quit() {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "the Inventory Mgt System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

}
