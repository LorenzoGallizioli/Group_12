package ObbiettiviComuni;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Classe madre degli obiettivi.
 */
public abstract class ObiettivoComune {

	private ImageIcon immagine;
	
	/**
	 * Controlla se le tessere nella libreria corrispondono all'obiettivo.
	 * 
	 * @param libreria
	 * 	 La libreria da controllare.
	 * 
	 * @return
	 * 	 TRUE se corrispondono, FALSE altrimenti.
	 */
	public abstract boolean check(Tessera[][] libreria);
	
	/**
	 * Restituisce l'immagine rappresentativa dell'obiettivo.
	 * 
	 * @return
	 * 	 L'immagine dell'obiettivo.
	 */
	public ImageIcon getImage() {
		return immagine;
	}
}
