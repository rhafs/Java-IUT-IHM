package passage_arg;

import javax.swing.*;

/**
 * Created on 11/05/15.
 *
 * @author gaugendre
 */
public class PassageArgs extends JFrame {
    private String[] listeSports;
    public PassageArgs() {
        super("Passage d'arguments");
        this.setContentPane(new MainPanel(this).getMainPanel());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        listeSports = new String[] {
                "Football", "Basketball", "Volleyball", "Tir à l'arc"
        };

    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace(System.err);
        }
        new PassageArgs();
    }

    public String[] getListeSports() {
        return listeSports;
    }
}
