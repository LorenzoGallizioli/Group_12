package Game;

import java.awt.Color;

/**
 * Definisce le librerie (una per ciascun giocatore) da riempire con le obiettivo prese dalla Tavola.
 * 
 * @author lorenzogallizioli
 */
public class Libreria {
	
	protected Tessera libreria[][] = new Tessera[6][5];
	
	/**
	 * Il costruttore della classe.
	 */
	public Libreria() {
		
	}

	/**
	 * Inserisce la tessera selezionata all'interno di uno specifico spazio della libreria.
	 * 
	 * @param tessera
	 *	 La tessera selezionata.
	 * @param riga
	 * 	 La riga della matrice.
	 * @param colonna
	 * 	 La colonna della matrice.
	 */
	public void inserisciTessera(Tessera tessera, int riga, int colonna) {
		libreria[riga][colonna] = tessera;
	}

	/**
	 * Restituisce la libreria.
	 * 
	 * @return libreria
	 * 	 La libreria.
	 */
	public Tessera[][] getLibreria() {
		return libreria;
	}
	
	/**
	 * Genera una libreria vuota.
	 * 
	 * @return
	 * 	 La libreria.
	 */
	public Tessera[][] generaLibreria() {	
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				libreria[i][j].Colore = Color.black;
				libreria[i][j].disponibile = false;
			}
		}
		return libreria;
	}
}
