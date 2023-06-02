package Images;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {
    private ImageIcon imageIcon;

    public ImageComponent(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageIcon.getImage(), 0, 0, null);
    }
}
