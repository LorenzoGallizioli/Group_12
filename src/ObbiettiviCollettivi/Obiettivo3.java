package ObbiettiviCollettivi;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Four tiles of the same type in the four corners of the bookshelf.
 */
public class Obiettivo3 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo3.png");

	
	public Obiettivo3() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		if ( libreria[0][0].getColor() == libreria[0][4].getColor() && libreria[0][4].getColor() == libreria[5][0].getColor()
				&& libreria[5][0].getColor() == libreria[5][4].getColor())
			return true;

		else
			return false;
	}

	public ImageIcon getImage() {
		return immagine;
	}

}
