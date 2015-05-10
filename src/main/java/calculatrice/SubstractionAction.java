package calculatrice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class SubstractionAction extends AbstractAction {
    private MainPanel mainPanel;

    public SubstractionAction(MainPanel mainPanel) {
        super(ResourceBundle.getBundle("calculatrice/Calculatrice").getString("plain.sub"));
        this.mainPanel = mainPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean ok = mainPanel.setOpLabel("-");
        if (ok) {
            mainPanel.readAndValidate();
            if (mainPanel.isOk())
                mainPanel.setResult(mainPanel.getOp1() - mainPanel.getOp2());
        }
    }
}
