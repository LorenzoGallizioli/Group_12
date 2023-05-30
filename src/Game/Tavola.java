package Game;

import java.awt.Color;
import java.util.Random;

/**
 * Definisce la tavola da gioco.
 * 
 * @author davidedellanno
 */
public class Tavola{
	
	static int  numPlayers = 0;
	
	public static Tessera[][] tavolaDaGioco = new Tessera[9][9];
	
	/**
	 * Costruttore della classe Tavola.
	 */
	public Tavola() {
		tavolaDaGioco[0][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[3][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[4][0] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][0] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[7][0] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][0] = new Tessera(Color.BLACK);
		
		tavolaDaGioco[0][1] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][1] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][1] = new Tessera(Color.BLACK);
		tavolaDaGioco[3][1] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][1] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][1] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][1] = new Tessera(Color.BLACK);
		tavolaDaGioco[7][1] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][1] = new Tessera(Color.BLACK);
		
		tavolaDaGioco[0][2] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][2] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][2] = new Tessera(Color.WHITE);
		tavolaDaGioco[3][2] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][2] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][2] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][2] = new Tessera(Color.WHITE);
		tavolaDaGioco[7][2] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][2] = new Tessera(Color.BLACK);
		
		tavolaDaGioco[0][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[1][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[2][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[3][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[7][3] = new Tessera(Color.WHITE);
		tavolaDaGioco[8][3] = new Tessera(Color.BLACK);
		
		tavolaDaGioco[0][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[1][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[2][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[3][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[7][4] = new Tessera(Color.WHITE);
		tavolaDaGioco[8][4] = new Tessera(Color.WHITE);
		
		tavolaDaGioco[0][5] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[2][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[3][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[7][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[8][5] = new Tessera(Color.WHITE);
		
		tavolaDaGioco[0][6] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][6] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][6] = new Tessera(Color.WHITE);
		tavolaDaGioco[3][6] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][6] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][6] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][6] = new Tessera(Color.WHITE);
		tavolaDaGioco[7][6] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][6] = new Tessera(Color.BLACK);
		
		tavolaDaGioco[0][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[3][7] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][7] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][7] = new Tessera(Color.WHITE);
		tavolaDaGioco[6][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[7][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][7] = new Tessera(Color.BLACK);
	
		tavolaDaGioco[0][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[3][8] = new Tessera(Color.WHITE);
		tavolaDaGioco[4][8] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[6][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[7][8] = new Tessera(Color.BLACK);
		tavolaDaGioco[8][8] = new Tessera(Color.BLACK);
		
		// Definisco il campo da gioco a seconda del numero di giocatori.
		switch(numPlayers) {
		
		// Se si gioca in 2 rimuovo le caselle destinate a 3 e 4 giocatori.
		case 2:
			tavolaDaGioco[4][0] = new Tessera(Color.BLACK);
			tavolaDaGioco[3][1] = new Tessera(Color.BLACK);
			tavolaDaGioco[7][3] = new Tessera(Color.BLACK);
			tavolaDaGioco[0][4] = new Tessera(Color.BLACK);
			tavolaDaGioco[8][4] = new Tessera(Color.BLACK);
			tavolaDaGioco[1][5] = new Tessera(Color.BLACK);
			tavolaDaGioco[5][7] = new Tessera(Color.BLACK);
			tavolaDaGioco[4][8] = new Tessera(Color.BLACK);
			tavolaDaGioco[5][0] = new Tessera(Color.BLACK);
			tavolaDaGioco[2][2] = new Tessera(Color.BLACK);
			tavolaDaGioco[6][2] = new Tessera(Color.BLACK);
			tavolaDaGioco[0][3] = new Tessera(Color.BLACK);
			tavolaDaGioco[8][5] = new Tessera(Color.BLACK);
			tavolaDaGioco[2][6] = new Tessera(Color.BLACK);
			tavolaDaGioco[6][6] = new Tessera(Color.BLACK);
			tavolaDaGioco[3][8] = new Tessera(Color.BLACK);
			break;
			
		// Se si gioca in 3 rimuovo le caselle destinate a 4 giocatori.
		case 3:
			tavolaDaGioco[4][0] = new Tessera(Color.BLACK);
			tavolaDaGioco[3][1] = new Tessera(Color.BLACK);
			tavolaDaGioco[7][3] = new Tessera(Color.BLACK);
			tavolaDaGioco[0][4] = new Tessera(Color.BLACK);
			tavolaDaGioco[8][4] = new Tessera(Color.BLACK);
			tavolaDaGioco[1][5] = new Tessera(Color.BLACK);
			tavolaDaGioco[5][7] = new Tessera(Color.BLACK);
			tavolaDaGioco[4][8] = new Tessera(Color.BLACK);
			break;
			
		// Se si gioca in 4 mantengo tutte le caselle.
		default:		
			break;
		}
		
	}
	
	/**
	 * Metodo che permette di generatre la tavola in modo randomico. 
	 */
	
	public static void generaTavola() {
		Color[] colori = {Color.green, Color.WHITE, Color.yellow, Color.CYAN, Color.blue, Color.PINK};
		Random rand = new Random();
		for(int i =0;i<9;i++) {
			for(int j =0; j<9;j++) {
				if(tavolaDaGioco[i][j].Colore == Color.WHITE) {
					int coloreRand = rand.nextInt(6);
					tavolaDaGioco[i][j].Colore = colori[coloreRand];
				}
			}
		}
	}
	
}
