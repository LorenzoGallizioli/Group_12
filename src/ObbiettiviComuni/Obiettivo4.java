package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 4: Two groups each containing 4 tiles of the same type in a 2x2
 * square.
 */
public class Obiettivo4 extends ObiettivoComune {

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo4.jpg");

	public Obiettivo4() {

	}

	public boolean check(Tessera[][] libreria) {

		int contGruppi = 0; // Numero di gruppi contenenti 4 tessere dello stesso colore in un quadrato.

		// Controlla se esistono quadrati da 4 tessere.
		for (int col = 0; col < 4; col++) {
			int contTessere = 0;
			for (int rig = 0; rig < 5; rig++) {
				if (libreria[rig][col].getColor() != Color.BLACK && libreria[rig + 1][col].getColor() != Color.BLACK
						&& libreria[rig][col + 1].getColor() != Color.BLACK
						&& libreria[rig + 1][col + 1].getColor() != Color.BLACK
						&& libreria[rig][col].getColor() == libreria[rig + 1][col].getColor()
						&& libreria[rig + 1][col].getColor() == libreria[rig][col + 1].getColor()
						&& libreria[rig][col + 1].getColor() == libreria[rig + 1][col + 1].getColor()) {
					contGruppi++;
					if (contGruppi == 2) {
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
