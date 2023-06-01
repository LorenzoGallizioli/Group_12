package Game;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;

/**
 * Definisce le obiettivo da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 */
public class Tessera{
	
	protected Color Colore;
	protected Boolean disponibile;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param Color
	 * 	 Il Color della tessera.
	 */
	public Tessera(Color Colore,Boolean disponibile) {
		this.Colore = Colore;
		this.disponibile = disponibile;
	}
	
	/**
	 * Restituisce il Color della tessera.
	 * 
	 * @return Color
	 * 	 Il Color della tessera.
	 */
	public Color getColor() {
		return Colore;
	}

	/**
	 * Restituisce se la tessera è disponibile o no.
	 * 
	 * @return
	 * 	 TRUE se disponibile, FALSE altrimenti.
	 */
	public Boolean getDisponibile() {
		return disponibile;
	}

	/**
	 * Imposta lo stato disponibile o non disponibile.
	 * 
	 * @param disponibile
	 * 	 La disponibilità.	 
	 */
	public void setDisponibile(Boolean disponibile) {
		this.disponibile = disponibile;
	}
}
