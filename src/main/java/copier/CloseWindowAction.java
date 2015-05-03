package copier;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class CloseWindowAction extends AbstractAction {
    private JFrame frame;

    public CloseWindowAction(JFrame frame) {
        super("Fin");
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        System.exit(0);
    }
}
