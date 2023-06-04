package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 5: Three columns each formed by 6 tiles of maximum three different types.
 */
public class Obiettivo5 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo5.jpg");

	public Obiettivo5() {

	}

	public boolean check(Tessera[][] libreria) {
		int colObiettivo = 0; // Numero di colonne che rispettano l'obiettivo.
		for (int col = 0; col <= 4; col++) {
			int countColori = 0; // Numero colori diversi.
			int countVerdi = 0;
			int countBlu = 0;
			int countGialle = 0;
			int countAzzurre = 0;
			int countFucsia = 0;
			int countBianche = 0;
			boolean colCompleta = true;

			for (int rig = 0; rig <= 5; rig++) {
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
			if (colCompleta) {
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

				if (countColori < 4) {
					colObiettivo++;
					if (colObiettivo == 3) {
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
