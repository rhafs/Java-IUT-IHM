package calculatrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class MultiplicationAction extends AbstractAction {
    private MainPanel mainPanel;

    public MultiplicationAction(MainPanel mainPanel) {
        super(ResourceBundle.getBundle("calculatrice/Calculatrice").getString("plain.mul"));
        this.mainPanel = mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean ok = mainPanel.setOpLabel("x");
        if (ok) {
            mainPanel.readAndValidate();
            if (mainPanel.isOk())
                mainPanel.setResult(mainPanel.getOp1() * mainPanel.getOp2());
        }
    }
}
