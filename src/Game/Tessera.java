package Game;

import java.awt.Color;

import javax.swing.JPanel;

/**
 * Definisce le tessere da inserire nella libreria.
 * 
 * @author lorenzogallizioli
 */
public class Tessera extends JPanel{
	
	protected Color Color;
	
	/**
	 * Il costruttore della classe.
	 * 
	 * @param Color
	 * 	 Il Color della tessera.
	 */
	public Tessera(Color Color) {
		super();
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
