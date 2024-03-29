package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 2: Four groups each containing at least 4 tiles of the same type.
 */
public class Obiettivo2 extends ObiettivoComune{

	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo2.jpg");
	
	public Obiettivo2() {
		
	}
	
	public boolean check(Tessera[][] libreria) {
		int contGruppi = 0;	// Numero di gruppi contenenti 4 tessere dello stesso colore.
		
		// Controlla se nelle colonne esistono gruppi da 4.
		for(int col = 0; col < 5; col++) { // 5 colonne.
			int contTessere = 0;
			for(int rig = 0; rig < 5; rig++) { // 6 righe.
				// Controllo tessera nella stessa colonna ma riga sotto.
				if(libreria[rig][col].getColor() != Color.BLACK && libreria[rig][col].getColor() == libreria[rig+1][col].getColor()) {
					contTessere++;
					if(contTessere == 3) {
						contGruppi++;
						if(contGruppi == 4) {
							return true;
						}
					}
				}
			}	
		}
		
		// Controlla se nelle righe esistono gruppi da 4.
		for(int rig = 0; rig <= 4; rig++) {
			int contTessere = 0;
			for (int col = 0; col < 4; col++) {
				if(libreria[rig][col].getColor() != Color.BLACK && libreria[rig][col].getColor() == libreria[rig][col+1].getColor()) {
					contTessere++;
					if(contTessere == 3) {
						contGruppi++;
						if(contGruppi == 4) {
							return true;
						}
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
