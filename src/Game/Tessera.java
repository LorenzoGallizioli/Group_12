package Game;

import java.awt.Color;

/**
 * Definisce le tessere da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 *
 */
public class Tessera {
	
	protected Color colore;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param colore
	 * 	 Il colore della tessera.
	 */
	public Tessera(Color colore) {
		this.colore = colore;
	}

	/**
	 * Restituisce il colore della tessera.
	 * 
	 * @return Color
	 * 	 Il colore della tessera.
	 */
	public Color getColore() {
		return colore;
	}

	/**
	 * Setta il colore della tessera.
	 * 
	 * @param colore
	 * 	 Il colore da settare.
	 */
	public void setColore(Color colore) {
		this.colore = colore;
	}

}
