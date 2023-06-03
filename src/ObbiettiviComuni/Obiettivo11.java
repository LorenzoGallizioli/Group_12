package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Five tiles of the same type forming an X.
 */
public class Obiettivo11 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo11.jpg");
	
	public Obiettivo11() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		
		// Controlla se esiste una tessera che si trova al centro di una X formata da tessere dello stesso colore.
		for(int col = 1; col < 3; col++) { 
			for(int rig = 1; rig < 5; rig++) { 
				if (libreria[rig][col].getColor() != Color.BLACK &&
					libreria[rig-1][col-1].getColor() != Color.BLACK &&
					libreria[rig+1][col-1].getColor() != Color.BLACK &&
					libreria[rig+1][col+1].getColor() != Color.BLACK &&
					libreria[rig][col].getColor() == libreria[rig-1][col-1].getColor() && 
					libreria[rig-1][col-1].getColor() == libreria[rig+1][col-1].getColor() && 
					libreria[rig-1][col+1].getColor() == libreria[rig+1][col+1].getColor()) {
					return true;
				}
			}	
		}

		return false;
	}

	public ImageIcon getImage() {
		return immagine;
	}

}
