import javax.swing.*;
import ui.Principal;
import ui.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Principal ui = new Principal();
            JFrame frame = new JFrame("InterfazPrototipo");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(ui.getMainPanel());
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
        
    }
}
