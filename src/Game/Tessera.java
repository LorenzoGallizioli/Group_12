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

	public Boolean getDisponibile() {
		return disponibile;
	}

	public void setDisponibile(Boolean disponibile) {
		this.disponibile = disponibile;
	}
}
