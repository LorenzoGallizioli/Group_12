package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Libreria;
import Game.Tessera;

/**
 * Six groups each containing at least 2 tiles of the same type (not necessarily in the depicted shape).
 * The tiles of one group can be different from those of another group.
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
				
				// Controllo tessera nella stessa riga ma colonna a destra.
				if(libreria[j][i].getColor() != Color.BLACK && libreria[j][i].getColor() == libreria[j][i+1].getColor()) {
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
