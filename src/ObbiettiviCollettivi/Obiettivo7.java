package ObbiettiviCollettivi;

import Game.Tessera;

/**
 * Five tiles of the same type forming a diagonal.
 */
public class Obiettivo7 extends ObiettivoComune {
	
	/**
	 * Controlla se la libreria ha gli stessi colori su una od entrambe diagonali.
	 */
	public boolean check (Tessera[][] libreria) {
		
		boolean coloriUguali = true;

		// Controllo della prima diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][i].getColor() != libreria[i+1][i+1].getColor()) {
		        coloriUguali = false;
		        break;
		    }
		}

		// Controllo della seconda diagonale
		for (int i = 0; i < 4; i++) {
		    if (libreria[i][4-i].getColor() != libreria[i+1][3-i].getColor()) {
		        coloriUguali = false;
		        break;
		    }
		}

		return coloriUguali;

	}
	
}
