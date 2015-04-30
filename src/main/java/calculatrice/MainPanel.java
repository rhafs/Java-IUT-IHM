package calculatrice;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 09/04/15.
 *
 * @author gaugendre
 */
public class MainPanel {
    private JPanel mainPanel;
    private JTextField firstOpField;
    private JTextField secOpField;
    private JButton addButton;
    private JTextField resField;
    private JLabel opLabel;
    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private double op1 = 0;
    private double op2 = 0;
    private boolean ok = true;

    public MainPanel() {
//        mainPanel.setFocusTraversalPolicyProvider(true);
        addButton.addActionListener(e -> {
            opLabel.setText("+");
            readAndValidate();
            if (ok) {
                resField.setText(String.format("%-9.2f", op1 + op2));
                firstOpField.selectAll();
                firstOpField.requestFocus();
            }
        });
        subButton.addActionListener(e -> {
            opLabel.setText("-");
            readAndValidate();
            if (ok) {
                resField.setText(String.format("%-9.2f", op1 - op2));
                firstOpField.selectAll();
                firstOpField.requestFocus();
            }
        });
        mulButton.addActionListener(e -> {
            opLabel.setText("x");
            readAndValidate();
            if (ok) {
                resField.setText(String.format("%-9.2f", op1 * op2));
                firstOpField.selectAll();
                firstOpField.requestFocus();
            }
        });
        divButton.addActionListener(e -> {
            opLabel.setText("/");
            readAndValidate();
            if (ok) {
                resField.setText(String.format("%-9.2f", op1 / op2));
                firstOpField.selectAll();
                firstOpField.requestFocus();
            }
        });
    }

    public void readAndValidate() {
        try {
            op1 = Double.parseDouble(firstOpField.getText());
            ok = true;
        } catch (NumberFormatException nfe) {
            firstOpField.selectAll();
            firstOpField.requestFocus();
            firstOpField.setText("???");
            resField.setText(" ");
            ok = false;
        }
        try {
            op2 = Double.parseDouble(secOpField.getText());
            ok = true;
        } catch (NumberFormatException nfe) {
            secOpField.setText("???");
            if (ok) {
                secOpField.selectAll();
                secOpField.requestFocus();
                resField.setText(" ");
                ok = false;
            }
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(7, 8, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setFont(new Font("Droid Sans", label1.getFont().getStyle(), 18));
        label1.setText("Opérande 1");
        mainPanel.add(label1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setFont(new Font("Droid Sans", label2.getFont().getStyle(), 18));
        label2.setText("Opérande 2");
        mainPanel.add(label2, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        firstOpField = new JTextField();
        mainPanel.add(firstOpField, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        secOpField = new JTextField();
        mainPanel.add(secOpField, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setFont(new Font("Droid Sans", label3.getFont().getStyle(), 18));
        label3.setText("Résultat");
        mainPanel.add(label3, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resField = new JTextField();
        resField.setEditable(false);
        resField.setFocusable(false);
        mainPanel.add(resField, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        addButton = new JButton();
        addButton.setFont(new Font("Droid Sans", addButton.getFont().getStyle(), 18));
        addButton.setText("+");
        mainPanel.add(addButton, new GridConstraints(1, 3, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, 30), null, 0, false));
        subButton = new JButton();
        subButton.setFont(new Font("Droid Sans", subButton.getFont().getStyle(), 18));
        subButton.setText("-");
        mainPanel.add(subButton, new GridConstraints(1, 4, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, 30), null, 0, false));
        divButton = new JButton();
        divButton.setFont(new Font("Droid Sans", divButton.getFont().getStyle(), 18));
        divButton.setText("/");
        mainPanel.add(divButton, new GridConstraints(1, 6, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, 30), null, 0, false));
        mulButton = new JButton();
        mulButton.setFont(new Font("Droid Sans", mulButton.getFont().getStyle(), 18));
        mulButton.setText("x");
        mainPanel.add(mulButton, new GridConstraints(1, 5, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(30, 30), null, 0, false));
        opLabel = new JLabel();
        opLabel.setFont(new Font("Droid Sans", opLabel.getFont().getStyle(), 18));
        opLabel.setText("+");
        mainPanel.add(opLabel, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setFont(new Font("Droid Sans", label4.getFont().getStyle(), 18));
        label4.setText("=");
        mainPanel.add(label4, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 5), null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(3, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(5, -1), null, 0, false));
        final Spacer spacer3 = new Spacer();
        mainPanel.add(spacer3, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 5), null, 0, false));
        final Spacer spacer4 = new Spacer();
        mainPanel.add(spacer4, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(5, -1), null, 0, false));
        firstOpField.setNextFocusableComponent(secOpField);
        secOpField.setNextFocusableComponent(addButton);
        addButton.setNextFocusableComponent(subButton);
        subButton.setNextFocusableComponent(mulButton);
        divButton.setNextFocusableComponent(firstOpField);
        mulButton.setNextFocusableComponent(divButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
