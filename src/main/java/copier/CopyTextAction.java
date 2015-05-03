package copier;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class CopyTextAction extends AbstractAction {
    private final JTextField text1;
    private final JTextField text2;

    public CopyTextAction(JTextField text1, JTextField text2) {
        super("Copier");
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text2.setText(text1.getText());
    }
}
