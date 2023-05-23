package ObbiettiviCollettivi;

import Game.Libreria;

public abstract class ObiettivoComune {
	
	/**
	 * Controlla se le tessere nella libreria corrispondono all'obiettivo.
	 * 
	 * @param libreria
	 * 	 La libreria da controllare.
	 * 
	 * @return
	 * 	 TRUE se corrispondono, FALSE altrimenti.
	 */
	public abstract boolean check(Libreria libreria);
	
}
