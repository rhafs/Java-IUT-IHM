package calculatrice;

import javax.swing.*;

/**
 * Created on 09/04/15.
 *
 * @author gaugendre
 */
public class Calculatrice extends JFrame{
    private JPanel mainPanel;

    public Calculatrice() {
        super("Calculatrice");
        this.mainPanel = new MainPanel(this).getMainPanel();
        this.setContentPane(mainPanel);
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
        new Calculatrice();
    }
}
