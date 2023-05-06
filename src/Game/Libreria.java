package Game;

/**
 * Definisce le librerie (una per ciascun giocatore) da riempire con le tessere prese dalla Tavola.
 * 
 * @author lorenzogallizioli
 */
public class Libreria {
	
	protected Tessera libreria[][] = new Tessera[5][5];
	
	

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
	 * 	 La libreria
	 */
	public Tessera[][] getLibreria() {
		return libreria;
	}
	
}
