package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 8: Four lines each formed by 5 tiles of maximum three different
 * types.
 */
public class Obiettivo8 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo8.jpg");

	public Obiettivo8() {

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
			boolean rigCompleta = true;

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
					rigCompleta = false;
				}
			}
			if (rigCompleta == true) {
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
