package Game;

/**
 * Definisce le tessere da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 */
public class Tessera {
	
	protected Colore colore;
	protected Oggetto oggetto;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param colore
	 * 	 Il colore della tessera.
	 */
	public Tessera(Colore colore) {
		this.colore = colore;
		switch(colore) {
			case VERDE:
				this.oggetto = Oggetto.GATTI;
				break;
			case GIALLO:
				this.oggetto = Oggetto.GIOCHI;
				break;
			case BLU:
				this.oggetto = Oggetto.CORNICI;
				break;
			case BIANCO:
				this.oggetto = Oggetto.LIBRI;
				break;
			case CIANO:
				this.oggetto = Oggetto.TROFEI;
				break;
			case MAGENTA:
				this.oggetto = Oggetto.PIANTE;
				break;
		}
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
