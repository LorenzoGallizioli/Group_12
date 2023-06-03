package ObbiettiviComuni;

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
				
		if(diagonale1(libreria) == false && diagonale2(libreria) == false && diagonale3(libreria) == false && diagonale4(libreria) == false) {
			return false;
		}
		else {
			return true;
		}
		
	}

	public boolean diagonale1(Tessera[][] libreria) {	
		int count=0;
		// Controllo della prima diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][i].getColor() != Color.BLACK && libreria[i][i].getColor() == libreria[i+1][i+1].getColor()) {
		        count++;
		    }
		    if (count==4) {
		    	return true;
		    }
		}
		return false;
	}
	
	public boolean diagonale2(Tessera[][] libreria) {
		int count=0;
		// Controllo della seconda diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][4-i].getColor() != Color.BLACK && libreria[i][4-i].getColor() == libreria[i+1][3-i].getColor()) {
		        count++;
		    }
		    if (count==4) {
		    	return true;
		    }
		}
		return false;
	}
	
	public boolean diagonale3(Tessera[][] libreria) {
		int count = 0;
		// Controllo della terza diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[5-i][i].getColor() != Color.BLACK && libreria[5-i][i].getColor() == libreria[4-i][i+1].getColor()) {
		        count++;
		    }
		    if (count==4) {
		    	return true;
		    }

		}
		return false;
	}

	public boolean diagonale4(Tessera[][] libreria) {
		int count = 0;
		// Controllo della quarta diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[5-i][4-i].getColor() != Color.BLACK && libreria[5-i][4-i].getColor() == libreria[4-i][3-i].getColor()) {
		        count++;
		    }
		    if (count==4) {
			  	return true;
		   }

		}
		return false;
	}

	public ImageIcon getImage() {
		return immagine;
	}
	
}
