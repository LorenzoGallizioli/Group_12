package Images;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import Game.Tessera;

public class Image {
	
	 public static ImageIcon image;
	
	public Image(ImageIcon image) {
		this.image=image;
	}

	public static ImageIcon sceltaImmagine(Color color) {
		
		if(color==Color.white) {
			image = new ImageIcon("./src/pics/Libri.png");
		}
		if(color == Color.green) {
			image = new ImageIcon("./src/pics/Gatti.png");
		}
		if(color == Color.yellow) {
			image = new ImageIcon("./src/pics/Giochi.png");
		}
		if(color == Color.blue) {
			image = new ImageIcon("./src/pics/Cornici.png");
		}
		if(color == Color.cyan) {
			image = new ImageIcon("./src/pics/Trofei.png");
		}
		if(color == Color.pink) {
			image = new ImageIcon("./src/pics/Piante.png");
		}
		if(color == Color.black){
			image = new ImageIcon("./src/pics/nero.jpg");
		}
		return image;
		
	}
	
	public static ImageIcon scaleImage(ImageIcon imageIcon, int maxWidth, int maxHeight) {
        java.awt.Image image = imageIcon.getImage();
        int width = image.getWidth(null);
        int height = image.getHeight(null);

        double scaleRatio = Math.min((double) maxWidth / width, (double) maxHeight / height);

        int newWidth = (int) (width * scaleRatio);
        int newHeight = (int) (height * scaleRatio);

        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        java.awt.Graphics2D g2 = resizedImage.createGraphics();
        g2.drawImage(image, 0, 0, newWidth, newHeight, null);
        g2.dispose();

        return new ImageIcon(resizedImage);
    }
	
}
