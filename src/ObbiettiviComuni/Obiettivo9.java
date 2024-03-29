package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 9: Two columns each formed by 6 different types of tiles.
 */
public class Obiettivo9 extends ObiettivoComune {
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo9.jpg");
	
	public Obiettivo9() {
		
	}
	
	public boolean check (Tessera[][] libreria) {
		int colObiettivo = 0; // Numero di colonne che rispettano l'obiettivo.
		for(int col = 0; col <= 4; col++) {
			int countColori = 0; // Numero colori diversi.
			int countVerdi = 0;
			int countBlu = 0;
			int countGialle = 0;
			int countAzzurre = 0;
			int countFucsia = 0;
			int countBianche = 0;
			boolean colCompleta = true;

			for(int rig = 0; rig <= 5; rig++) {
				if(libreria[rig][col].getColor() != Color.BLACK) {
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
				if(countVerdi == 1) {
					countColori++;
				}
				if(countBlu == 1) {
					countColori++;
				}
				if(countGialle == 1) {
					countColori++;
				}
				if(countAzzurre == 1) {
					countColori++;
				}
				if(countFucsia == 1) {
					countColori++;
				}
				if(countBianche == 1) {
					countColori++;
				}
				
				// Se esistono 6 colori diversi nella colonna.
				if(countColori == 6) {
					colObiettivo++;
					// Se 2 colonne centrano l'obiettivo.
					if(colObiettivo == 2) {
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
