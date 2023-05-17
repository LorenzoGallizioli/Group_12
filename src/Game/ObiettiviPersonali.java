package Game;

import java.awt.Color;
import java.util.Random;

public class ObiettiviPersonali {
	
	public static Tessera[][] obiettivo = new Tessera[6][5];
	
	/**
	 * Costruttore della classe ObiettiviPersonali.
	 */
	public ObiettiviPersonali() {
		for(int righe =0;righe<6;righe++) {
			for(int col = 0;col<5;col++) {
				obiettivo[righe][col]= new Tessera(Color.gray);
			}
		}
	}
	
	public static void generaObiettivoPersonale() {
		Color[] colori = {Color.green, Color.WHITE, Color.yellow, Color.CYAN, Color.blue, Color.PINK};
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				int prob = rand.nextInt(10);
				if (prob < 8) {
					obiettivo[i][j] = new Tessera(Color.BLACK);
				}
				else {
					int coloreRand = rand.nextInt(6);
					obiettivo[i][j] =new Tessera(colori[coloreRand]);
				}
			}
		}
	}
}
