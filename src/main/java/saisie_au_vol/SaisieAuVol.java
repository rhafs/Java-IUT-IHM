package saisie_au_vol;

import javax.swing.*;
import java.util.ResourceBundle;

/**
 * Created on 04/05/15.
 *
 * @author gaugendre
 */
public class SaisieAuVol extends JFrame {
    private JPanel mainPanel;

    public SaisieAuVol() {
        super(ResourceBundle.getBundle("saisie_au_vol/SaisieAuVol").getString("plain.title"));
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
        new SaisieAuVol();
    }
}
