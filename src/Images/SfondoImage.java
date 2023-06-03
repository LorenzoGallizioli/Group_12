package Images;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SfondoImage extends JPanel{
	  private java.awt.Image backgroundImage;
	    
	    public void setBackgroundImage(java.awt.Image image) {
	        this.backgroundImage = image;
	        Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
	        setPreferredSize(size);
	        setMinimumSize(size);
	        setMaximumSize(size);
	        setSize(size);
	        setLayout(null);
	    }
	    
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (backgroundImage != null) {
	            g.drawImage(backgroundImage, 0, 0, null);
	        }

	    }
}
