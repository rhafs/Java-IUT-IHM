package choix_ordinateur;

import javax.swing.*;

/**
 * Created on 04/05/15.
 *
 * @author gaugendre
 */
public class ChoixOrdinateur extends JFrame {
    private JPanel mainPanel;

    public ChoixOrdinateur() {
        super("Génération automatique d'un entier aléatoire");
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
        new ChoixOrdinateur();
    }
}
