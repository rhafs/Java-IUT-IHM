package copier;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * Created on 03/05/15.
 *
 * @author gaugendre
 */
public class ChangeFontSizeAction implements MouseWheelListener {
    private JButton button;

    public ChangeFontSizeAction(JButton button) {
        this.button = button;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        Font f = button.getFont();
        int newSize = f.getSize() - e.getWheelRotation();
        newSize = newSize <= 0 ? 0 : newSize;
        f = new Font(f.getFontName(), f.getStyle(), newSize);
        button.setFont(f);
    }
}
