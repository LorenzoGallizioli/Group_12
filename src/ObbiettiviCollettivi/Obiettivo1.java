package ObbiettiviCollettivi;

import Game.Libreria;

/**
 * Six groups each containing at least 2 tiles of the same type (not necessarily in the depicted shape).
 * The tiles of one group can be different from those of another group. 
 */
public class Obiettivo1 extends ObiettivoComune{

	@Override
	public boolean check(Libreria libreria) {
		return false;
	}

}
