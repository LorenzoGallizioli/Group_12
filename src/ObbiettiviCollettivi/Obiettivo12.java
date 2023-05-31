package ObbiettiviCollettivi;

import java.awt.Color;

import javax.swing.ImageIcon;

import Game.Tessera;

/**
 * Five columns of increasing or decreasing height. 
 * Starting from the first column on the left or on the right, each next column must be made of exactly one more tile. 
 * Tiles can be of any type.
 */
public class Obiettivo12 extends ObiettivoComune {
	
	private ImageIcon immagine = new ImageIcon("./src/pics/Obiettivo12.png");
	
	public Obiettivo12() {
		
	}
	
	public boolean check(Tessera[][] libreria) {

		int counter = 0;
		int rig = 0;
		
		// Decrescente.
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
		
		// Crescente.
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
