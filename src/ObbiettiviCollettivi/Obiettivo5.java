package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Three columns each formed by 6 tiles of maximum three different types. 
 * One column can show the same or a different combination of another column.
 */
public class Obiettivo5 extends ObiettivoComune {
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo5.jpg");

	
	public Obiettivo5() {
		
	}
	
	public boolean check (Tessera[][] libreria) {
		int counterDiverso = 0;
		int colObiettivo = 0;
		for(int col = 0; col <= 4; col++) {
			int countVerdi = 0;
			int countBlu = 0;
			int countGialle = 0;
			int countAzzurre = 0;
			int countFucsia = 0;
			int countBianche = 0;
			boolean colCompleta = true;

			for(int rig = 0; rig <= 5; rig++) {
				if(libreria[rig][col]!= null) {
					if(libreria[rig][col].getColor() == Color.GREEN) {
						countVerdi++;
					}
					else if(libreria[rig][col].getColor() == Color.BLUE) {
						countBlu++;
					}
					else if(libreria[rig][col].getColor() == Color.YELLOW) {
						countGialle++;
					}
					else if(libreria[rig][col].getColor() == Color.CYAN) {
						countAzzurre++;
					}
					else if(libreria[rig][col].getColor() == Color.PINK) {
						countFucsia++;
					}
					else if(libreria[rig][col].getColor() == Color.WHITE) {
						countBianche++;
					}
				}
				else {
					colCompleta = false;
				}
			}
			if (colCompleta) {
				if(countVerdi > 0) {
					counterDiverso++;
				}
				if(countBlu > 0) {
					counterDiverso++;
				}
				if(countGialle > 0) {
					counterDiverso++;
				}
				if(countAzzurre > 0) {
					counterDiverso++;
				}
				if(countFucsia > 0) {
					counterDiverso++;
				}
				if(countBianche > 0) {
					counterDiverso++;
				}
				
				if(counterDiverso < 4) {
					colObiettivo++;
					if(colObiettivo == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public ImageIcon getImage() {
		return immagine;
	}

}
