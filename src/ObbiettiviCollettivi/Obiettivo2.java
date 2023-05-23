package ObbiettiviCollettivi;

import Game.Libreria;

/**
 * Four groups each containing at least 4 tiles of the same type (not necessarily in the depicted shape).
 * The tiles of one group can be different from those of another group.
 */
public class Obiettivo2 extends ObiettivoComune{

	@Override
	public boolean check(Libreria libreria) {
		return false;
	}

}
