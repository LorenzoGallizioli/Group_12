package ObbiettiviCollettivi;

import Game.Tessera;

/**
 * Five tiles of the same type forming a diagonal.
 */
public class Obiettivo7 extends ObiettivoComune {
	
	/**
	 * Controlla se la libreria ha gli stessi colori sulla diagonale.
	 */
	public boolean check (Tessera[][] libreria) {
		if(
				libreria[0][0].getColor() == libreria[1][1].getColor() &&
				libreria[1][1].getColor() == libreria[2][2].getColor() &&
				libreria[2][2].getColor() == libreria[3][3].getColor() &&
				libreria[3][3].getColor() == libreria[4][4].getColor()
				)
			return true;
		
		else
			return false;
	}
	
}
