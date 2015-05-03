package copier;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class CloseWindowAction extends AbstractAction {
    private JFrame frame;

    public CloseWindowAction(JFrame frame) {
        super(ResourceBundle.getBundle("copier/Copier").getString("plain.end"));
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        System.exit(0);
    }
}
