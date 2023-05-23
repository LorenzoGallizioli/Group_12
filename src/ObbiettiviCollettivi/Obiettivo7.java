package ObbiettiviCollettivi;

import Game.Libreria;

/**
 * Five tiles of the same type forming a diagonal.
 */
public class Obiettivo7 extends ObiettivoComune {
	
	/**
	 * Controlla se la libreria ha gli stessi colori sulla diagonale.
	 */
	public boolean check (Libreria libreria) {
		if(
				libreria.getLibreria()[0][0].getColor()	== libreria.getLibreria()[1][1].getColor() &&
				libreria.getLibreria()[1][1].getColor() == libreria.getLibreria()[2][2].getColor() &&
				libreria.getLibreria()[2][2].getColor() == libreria.getLibreria()[3][3].getColor() &&
				libreria.getLibreria()[3][3].getColor() == libreria.getLibreria()[4][4].getColor()
				)
			return true;
		
		else
			return false;
	}
	
}
