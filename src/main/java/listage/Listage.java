package listage;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created on 07/05/15.
 *
 * @author gaugendre
 */
public class Listage extends JFrame {
    public Listage() {
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
        new Listage();
    }
}
