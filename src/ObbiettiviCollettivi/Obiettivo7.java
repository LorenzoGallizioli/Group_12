package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Five tiles of the same type forming a diagonal.
 */
public class Obiettivo7 extends ObiettivoComune {
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo7.jpg");

	
	public Obiettivo7() {
		
	}
	
	public boolean check (Tessera[][] libreria) {
		
		boolean coloriUguali = true;

		// Controllo della prima diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][i].getColor() == Color.BLACK || libreria[i][i].getColor() != libreria[i+1][i+1].getColor()) {
		        coloriUguali = false;
		        break;
		    }
		}

		// Controllo della seconda diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][4-i].getColor() == Color.BLACK || libreria[i][4-i].getColor() != libreria[i+1][3-i].getColor()) {
		        coloriUguali = false;
		        break;
		    }
		}
		
		// Controllo della terza diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[5-i][i].getColor() == Color.BLACK || libreria[5-i][i].getColor() != libreria[4-i][i+1].getColor()) {
		        coloriUguali = false;
		        break;
		    }
		}
		
		// Controllo della quarta diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[5-i][4-i].getColor() == Color.BLACK || libreria[5-i][4-i].getColor() != libreria[4-i][3-i].getColor()) {
			    coloriUguali = false;
			    break;
				}
		}

		return coloriUguali;

	}

	public ImageIcon getImage() {
		return immagine;
	}
	
}
