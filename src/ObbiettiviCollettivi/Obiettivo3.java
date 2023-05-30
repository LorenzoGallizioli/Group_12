package ObbiettiviCollettivi;

import Game.Tessera;

/**
 * Four tiles of the same type in the four corners of the bookshelf.
 */
public class Obiettivo3 extends ObiettivoComune {

	/**
	 * Controlla se la libreria ha gli stessi colori agli angoli.
	 */
	public boolean check(Tessera[][] libreria) {
		if ( libreria[0][0].getColor() == libreria[0][4].getColor() && libreria[0][4].getColor() == libreria[5][0].getColor()
				&& libreria[5][0].getColor() == libreria[5][4].getColor())
			return true;

		else
			return false;
	}

}
