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
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param Color
	 * 	 Il Color della tessera.
	 */
	public Tessera(Color Colore) {
		this.Colore = Colore;	
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

}
