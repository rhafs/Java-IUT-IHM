package saisie_au_vol;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created on 04/05/15.
 *
 * @author gaugendre
 */
public class FieldValidation extends KeyAdapter {
    private JTextField field;

    public FieldValidation(JTextField field) {
        this.field = field;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        if (c == KeyEvent.VK_ESCAPE) {
            field.setText("");
        } else if (!Character.isDigit(c)) {
            e.consume();
        }
    }
}
