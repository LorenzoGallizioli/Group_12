package ObbiettiviComuni;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Obiettivo 12: Five columns of increasing or decreasing height, of any type. 
 */
public class Obiettivo12 extends ObiettivoComune {
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo12.jpg");
	
	public Obiettivo12() {
		
	}
	
	public boolean check(Tessera[][] libreria) {

		int counter = 0;
		int rig = 0;
		
		// Ordine decrescente.
		for(int col = 0; col < 5; col++) {
			
			if(libreria[rig][col].getColor() != Color.BLACK) {
				return false;
			}				
			
			if(libreria[rig][col].getColor() == Color.BLACK && libreria[rig + 1][col].getColor() != Color.BLACK) {
				counter++;					
			}
			rig++;
			
			if(counter == 5) {
				return true;
			}
		}
		
		// Ordine crescente.
		counter = 0;
		rig = 4;
		for(int col = 0; col < 5; col++) {
			if(libreria[rig][col].getColor() != Color.BLACK) {
				return false;
			}				
			
			if(libreria[rig][col].getColor() == Color.BLACK && libreria[rig + 1][col].getColor() != Color.BLACK) {
				counter++;					
			}
			rig--;
			
			if(counter == 5) {
				return true;
			}
		}
		return false;
	}

	public ImageIcon getImage() {
		return immagine;
	}

}
