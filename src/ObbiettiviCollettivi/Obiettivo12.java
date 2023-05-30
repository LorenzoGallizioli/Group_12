package ObbiettiviCollettivi;

import java.awt.Color;

import Game.Tessera;

/**
 * Five columns of increasing or decreasing height. 
 * Starting from the first column on the left or on the right, each next column must be made of exactly one more tile. 
 * Tiles can be of any type.
 */
public class Obiettivo12 extends ObiettivoComune {
	
	public boolean check(Tessera[][] libreria) {
		int start = 0;
		
		for(int col = 0; col < 4; col++) {
			if(libreria[0][col].getColor() == Color.BLACK) {
				return false;
			}
		}
		
		for(int rig = start; rig < 5; rig++) {
			if(rig == 5) {
				start++;
			}
		}
	}

}
