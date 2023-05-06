package Game;

/**
 * Definisce le tessere da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 */
public class Tessera {
	
	protected Colore colore;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param colore
	 * 	 Il colore della tessera.
	 */
	public Tessera(Colore colore) {
		this.colore = colore;
	}

	/**
	 * Restituisce il colore della tessera.
	 * 
	 * @return Color
	 * 	 Il colore della tessera.
	 */
	public Colore getColore() {
		return colore;
	}

	/**
	 * Setta il colore della tessera.
	 * 
	 * @param colore
	 * 	 Il colore da settare.
	 */
	public void setColore(Colore colore) {
		this.colore = colore;
	}

}
