package Images;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

import javax.swing.ImageIcon;

import Game.Tessera;
/**
 * 
 * Classe che permette di abbinare ad il colore della tessera la corrisspettiva immagine
 * @author DavideDell'Anno
 */
public class Image {
	
	 public static ImageIcon image;
	
	 
	/**
	* Costruttore della classe
	* @param image 
	*/ 	
	public Image(ImageIcon image) {
		this.image=image;
	}
	
	
	//selezione dell'immagine a seconda del colore della tessera
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
	
	/**
	 * Metodo per ingrandire o rimpicciolire un'immagine
	 * @param imageIcon
	 * @param maxWidth
	 * @param maxHeight
	 * @return resizedImage
	 */
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
	
	public static ImageIcon scurisciImage(ImageIcon imgRes) {
	    java.awt.Image image = imgRes.getImage();
	    BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
	    Graphics2D graphics = bufferedImage.createGraphics();
	    graphics.drawImage(image, 0, 0, null);
	    graphics.dispose();

	    float scaleFactor = 0.5f; // Modifica la sfumatura dell'immagine
	    RescaleOp rescaleOp = new RescaleOp(scaleFactor, 0, null);

	    BufferedImage darkenedImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	    Graphics2D darkenedGraphics = darkenedImage.createGraphics();
	    darkenedGraphics.drawImage(bufferedImage, rescaleOp, 0, 0);
	    darkenedGraphics.dispose();

	    return new ImageIcon(darkenedImage);
	}

	
}
