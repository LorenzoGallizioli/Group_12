package Game;

import java.awt.Color;
import java.util.Random;

public class ObiettiviPersonali {
	
	static Tessera[][] tessere = new Tessera[6][5];
	
	/**
	 * Costruttore della classe ObiettiviPersonali.
	 */
	public ObiettiviPersonali() {
		
	}
	
	public static void generaObiettivoPersonale() {
		Color[] colori = {Color.green, Color.WHITE, Color.yellow, Color.CYAN, Color.blue, Color.PINK};
		Random rand = new Random();
		for(int i =0;i<9;i++) {
			for(int j =0; j<9;j++) {
				if(rand.nextInt(10) < 9) {
					tessere[i][j].Colore = Color.BLACK;
				}
				else {
					int coloreRand = rand.nextInt(6);
					tessere[i][j].Colore = colori[coloreRand];
				}
			}
		}
	}
}
