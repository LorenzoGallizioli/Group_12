package ObbiettiviCollettivi;

import java.awt.Color;

import Game.Libreria;
import Game.Tessera;

/**
 * 6 gruppi contenenti almeno 2 tessere dello stesso colore.
 */
public class Obiettivo1 extends ObiettivoComune{
	
	public Obiettivo1() {
	}
	
	/*
	 * Controlla se nella libreria esistono 6 gruppi contenenti almeno 2 tessere dello stesso colore.
	 */
	public boolean check(Tessera[][] libreria) {	
		
		int cont = 0;
		
		for(int j = 0; j <= 5; j++) {
			for(int i = 0; i <= 4; i++) {
				
				// Controllo tessera nella stessa colonna ma riga sotto.
				if(libreria[i][j].getColor() != Color.BLACK && libreria[i][j].getColor() == libreria[i+1][j].getColor()) {
					cont++;
					i++;
					if(cont == 6) {
						return true;
					}
				}
				else {
					cont = 0; // In questo modo se trova + di 2 adiacenti queste contano una volta sola.
				}
				
				// Controllo tessera nella stessa riga ma colonna a destra.
				if(libreria[j][i].getColor() != Color.BLACK && libreria[j][i].getColor() == libreria[j][i+1].getColor()) {
					cont++;
					i++;
					if(cont == 6) {
						return true;
					}
				}
				else {
					cont = 0;
				}
			}	
		}
				
		return false;
	}

}
