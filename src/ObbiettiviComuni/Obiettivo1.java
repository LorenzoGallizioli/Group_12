package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Libreria;
import Game.Tessera;

/**
 * Obiettivo 1: Six groups each containing at least 2 tiles of the same type.
 */
public class Obiettivo1 extends ObiettivoComune{
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo1.jpg");
	
	public Obiettivo1() {
	}
	
	public boolean check(Tessera[][] libreria) {	
		int cont = 0;
		
		for(int j = 0; j <= 4; j++) {
			for(int i = 0; i < 5; i++) {
				
				// Controllo tessera nella stessa colonna ma riga sotto.
				if(libreria[i][j].getColor() != Color.BLACK && libreria[i][j].getColor() == libreria[i+1][j].getColor()) {
					cont++;
					i++;
					if(cont == 6) {
						return true;
					}
				}
				else {
					cont = 0; // In questo modo se trova + di 2 adiacenti queste contano una volta sola.
				}
				
				
			}	

			
		}
		for(int j = 0; j < 4; j++ ) {
			for(int i = 0; i <= 5; i++) {
				// Controllo tessera nella stessa riga ma colonna a destra.
				if(libreria[i][j].getColor() != Color.BLACK && libreria[i][j].getColor() == libreria[i][j+1].getColor()) {
					cont++;
					i++;
					if(cont == 6) {
						return true;
					}
				}
				else {
					cont = 0;
				}
			}
		}
				
		return false;
	}
	
	public ImageIcon getImage() {
		return immagine;
	}

}
