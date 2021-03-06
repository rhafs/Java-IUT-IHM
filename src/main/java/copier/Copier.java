package copier;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created on 09/04/15.
 *
 * @author gaugendre
 */
public class Copier extends JFrame {
    public Copier() {
        super(ResourceBundle.getBundle("copier/Copier").getString("plain.title"));
        this.setContentPane(new MainPanel(this).getMainPanel());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace(System.err);
        }
        new Copier();
    }
}
