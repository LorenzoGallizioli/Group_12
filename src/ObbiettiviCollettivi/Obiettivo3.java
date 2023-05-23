package ObbiettiviCollettivi;

import Game.Libreria;

/**
 * Four tiles of the same type in the four corners of the bookshelf.
 */
public class Obiettivo3 extends ObiettivoComune{
	
	/**
	 * Controlla se la libreria ha gli stessi colori agli angoli.
	 */
	public boolean check (Libreria libreria) {
		if (
				libreria.getLibreria()[0][0].getColor() == libreria.getLibreria()[0][4].getColor() &&
				libreria.getLibreria()[0][4].getColor() == libreria.getLibreria()[4][0].getColor() &&
				libreria.getLibreria()[4][0].getColor() == libreria.getLibreria()[4][4].getColor()
				)
			return true;
		
		else
			return false;
	}

}
