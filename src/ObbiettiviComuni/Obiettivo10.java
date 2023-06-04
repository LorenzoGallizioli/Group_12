package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 10: Two lines each formed by 5 different types of tiles.
 */
public class Obiettivo10 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo10.jpg");

	public Obiettivo10() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		int rigaObiettivo = 0; // Numero righe che rispettano l'obiettivo.
		for (int rig = 0; rig <= 5; rig++) {
			int countColori = 0; // Numero colori diversi.
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
					countColori++;
				}
				if (countBlu > 0) {
					countColori++;
				}
				if (countGialle > 0) {
					countColori++;
				}
				if (countAzzurre > 0) {
					countColori++;
				}
				if (countFucsia > 0) {
					countColori++;
				}
				if (countBianche > 0) {
					countColori++;
				}
				
				// Se esistono 5 colori diversi nella riga.
				if (countColori == 5) {
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
