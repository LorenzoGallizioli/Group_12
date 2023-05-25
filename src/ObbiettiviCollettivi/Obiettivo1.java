package ObbiettiviCollettivi;

import Game.Libreria;
import Game.Tessera;

/**
 * Six groups each containing at least 2 tiles of the same type (not necessarily in the depicted shape).
 * The tiles of one group can be different from those of another group. 
 */
public class Obiettivo1 extends ObiettivoComune{
	
	public Obiettivo1() {
	}
	
	public boolean check(Tessera[][] libreria) {	
		
		int cont = 0;
		
		for(int j = 0; j <= 5; j++) {
			for(int i = 0; i <= 4; i++) {
				
				// Controllo tessera nella stessa colonna ma riga sotto.
				if(libreria[i][j].getColor() == libreria[i+1][j].getColor()) {
					cont++;
					if(cont == 6) {
						return true;
					}
				}
				
				// Controllo tessera nella stessa riga ma colonna a destra.
				if(libreria[j][i].getColor() == libreria[j][i+1].getColor()) {
					cont++;
					if(cont == 6) {
						return true;
					}
				}
			}	
		}
				
		return false;
	}

}
