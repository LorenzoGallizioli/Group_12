package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Two lines each formed by 5 different types of tiles. One line can show the same or a different combination of the other line.
 */
public class Obiettivo10 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo10.jpg");

	public Obiettivo10() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		int rigaObiettivo = 0;
		for (int rig = 0; rig <= 5; rig++) {
			int counterDiverso = 0;
			int countVerdi = 0;
			int countBlu = 0;
			int countGialle = 0;
			int countAzzurre = 0;
			int countFucsia = 0;
			int countBianche = 0;
			boolean colCompleta = true;

			for (int col = 0; col <= 4; col++) {
				if (libreria[rig][col].getColor() != Color.BLACK) {
					if (libreria[rig][col].getColor() == Color.GREEN) {
						countVerdi++;
					} else if (libreria[rig][col].getColor() == Color.BLUE) {
						countBlu++;
					} else if (libreria[rig][col].getColor() == Color.YELLOW) {
						countGialle++;
					} else if (libreria[rig][col].getColor() == Color.CYAN) {
						countAzzurre++;
					} else if (libreria[rig][col].getColor() == Color.PINK) {
						countFucsia++;
					} else if (libreria[rig][col].getColor() == Color.WHITE) {
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
				
				// Se esistono 5 colori diversi nella riga.
				if (counterDiverso == 5) {
					rigaObiettivo++;
					// Se 2 righe centrano l'obiettivo.
					if (rigaObiettivo == 2) {
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
