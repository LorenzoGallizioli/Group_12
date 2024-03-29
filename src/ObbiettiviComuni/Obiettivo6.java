package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 6: Eight tiles of the same type.
 */
public class Obiettivo6  extends ObiettivoComune{

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo6.jpg");
	
	public Obiettivo6() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		int countVerdi = 0;
		int countBlu = 0;
		int countGialle = 0;
		int countAzzurre = 0;
		int countFucsia = 0;
		int countBianche = 0;
		// Per ogni riga e colonna nella matrice libreria.
		for(Tessera[] riga_colonna : libreria) {
			// Per ogni tessera in ogni riga o colonna.
			for(Tessera tessera : riga_colonna) {
				if(tessera.getColor() == Color.GREEN)
					countVerdi++;
				else if(tessera.getColor() == Color.BLUE)
					countBlu++;
				else if(tessera.getColor() == Color.YELLOW)
					countGialle++;
				else if(tessera.getColor() == Color.CYAN)
					countAzzurre++;
				else if(tessera.getColor() == Color.PINK)
					countFucsia++;
				else if(tessera.getColor() == Color.WHITE)
					countBianche++;
			}
			
			if(countVerdi >= 8 || countBlu >= 8 || countGialle >= 8 || countAzzurre >= 8 || countFucsia >= 8 || countBianche >= 8) {
				return true;
			}
		}
		
		return false;
	}
	
	public ImageIcon getImage() {
		return immagine;
	}

}
