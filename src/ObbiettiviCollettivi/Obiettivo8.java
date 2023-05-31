package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Four lines each formed by 5 tiles of maximum three different types. One line
 * can show the same or a different combination of another line.
 */
public class Obiettivo8 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo.png");
	
	public Obiettivo8() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		int counterDiverso = 0;
		int rigaObiettivo = 0;
		for (int rig = 0; rig <= 5; rig++) {
			int countVerdi = 0;
			int countBlu = 0;
			int countGialle = 0;
			int countAzzurre = 0;
			int countFucsia = 0;
			int countBianche = 0;
			boolean colCompleta = true;

			for (int col = 0; col <= 4; col++) {
				if (libreria[rig][col] != null) {
					if (libreria[rig][col].getColor() == Color.GREEN) {
						countVerdi++;
					} else if (libreria[rig][col].getColor() == Color.BLUE) {
						countBlu++;
					} else if (libreria[rig][col].getColor() == Color.YELLOW) {
						countGialle++;
					} else if (libreria[rig][col].getColor() == Color.CYAN) {
						countAzzurre++;
					} else if (libreria[rig][col].getColor() == Color.GREEN) {
						countFucsia++;
					} else if (libreria[rig][col].getColor() == Color.GREEN) {
						countBianche++;
					}
				} else {
					colCompleta = false;
				}
			}
			if (colCompleta == true) {
				if (countVerdi > 0) {
					counterDiverso++;
				}
				if (countBlu > 0) {
					counterDiverso++;
				}
				if (countGialle > 0) {
					counterDiverso++;
				}
				if (countAzzurre > 0) {
					counterDiverso++;
				}
				if (countFucsia > 0) {
					counterDiverso++;
				}
				if (countBianche > 0) {
					counterDiverso++;
				}

				if (counterDiverso < 4) {
					rigaObiettivo++;
					if (rigaObiettivo == 3) {
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
