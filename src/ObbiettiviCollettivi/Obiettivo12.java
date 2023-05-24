package ObbiettiviCollettivi;

import Game.Tessera;

/**
 * Five columns of increasing or decreasing height. 
 * Starting from the first column on the left or on the right, each next column must be made of exactly one more tile. 
 * Tiles can be of any type.
 */
public class Obiettivo12 extends ObiettivoComune {
	
	public boolean check(Tessera[][] libreria) {
		return false;
	}

}
