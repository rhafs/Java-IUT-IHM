package saisie_au_vol;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

/**
 * Created on 04/05/15.
 *
 * @author gaugendre
 */
public class FieldValidation extends KeyAdapter {
    private ResourceBundle bundle;
    private MainPanel mainPanel;

    public FieldValidation(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        this.bundle = ResourceBundle.getBundle("saisie_au_vol/SaisieAuVol");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        if (c == KeyEvent.VK_ESCAPE) {
            mainPanel.emptyField();
        } else if (Character.isDigit(c)) {
            mainPanel.setMessageText(bundle.getString("label.is_digit"));
        } else if (Character.isLetter(c)) {
            mainPanel.setMessageText(bundle.getString("label.is_letter"));
        } else {
            mainPanel.setMessageText(bundle.getString("label.no_digit_nor_letter"));
        }
        mainPanel.packFrame();
    }
}
