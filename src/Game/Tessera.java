package Game;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;

/**
 * Definisce le tessere da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 */
public class Tessera{
	
	protected Color Color;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param Color
	 * 	 Il Color della tessera.
	 */
	public Tessera(Color Color) {
		this.Color = Color;	
	}
	
	
	/**
	 * Restituisce il Color della tessera.
	 * 
	 * @return Color
	 * 	 Il Color della tessera.
	 */
	public Color getColor() {
		return Color;
	}

}
