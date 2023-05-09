package Game;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;

public class Tavola{
	
	static int  numPlayers = 0;
	
	
	public static Tessera[][] tavolaDaGioco = new Tessera[9][9];
	
	public static void tavola() {	

		tavolaDaGioco[0][0] = new Tessera(null);
		tavolaDaGioco[0][1] = new Tessera(null);
		tavolaDaGioco[0][2] = new Tessera(null);
		tavolaDaGioco[0][3] = new Tessera(null);
		tavolaDaGioco[0][4] = new Tessera(Color.BLACK);
		tavolaDaGioco[0][5] = new Tessera(Color.BLACK);
		tavolaDaGioco[0][6] = new Tessera(null);
		tavolaDaGioco[0][7] = new Tessera(null);
		tavolaDaGioco[0][8] = new Tessera(null);
		
		tavolaDaGioco[1][0] = new Tessera(null);
		tavolaDaGioco[1][1] = new Tessera(null);
		tavolaDaGioco[1][2] = new Tessera(null);
		tavolaDaGioco[1][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[1][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[1][5] = new Tessera(Color.BLACK);
		tavolaDaGioco[1][6] = new Tessera(null);
		tavolaDaGioco[1][7] = new Tessera(null);
		tavolaDaGioco[1][8] = new Tessera(null);
		
		tavolaDaGioco[2][0] = new Tessera(null);
		tavolaDaGioco[2][1] = new Tessera(null);
		tavolaDaGioco[2][2] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][3] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][4] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][5] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][6] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][7] = new Tessera(Color.BLACK);
		tavolaDaGioco[2][8] = new Tessera(null);
		
		tavolaDaGioco[3][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[3][2] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][5] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][6] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][7] = new Tessera(Color.GREEN);
		tavolaDaGioco[3][8] = new Tessera(Color.GREEN);
		
		tavolaDaGioco[4][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[4][2] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][5] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][6] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][7] = new Tessera(Color.GREEN);
		tavolaDaGioco[4][8] = new Tessera(Color.GREEN);
		
		tavolaDaGioco[5][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[5][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[5][2] = new Tessera(Color.CYAN);
		tavolaDaGioco[5][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[5][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[5][5] = new Tessera(Color.WHITE);
		tavolaDaGioco[5][6] = new Tessera(Color.CYAN);
		tavolaDaGioco[5][7] = new Tessera(Color.GREEN);
		tavolaDaGioco[5][8] = new Tessera(Color.GREEN);
		
		tavolaDaGioco[6][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[6][2] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][5] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][6] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][7] = new Tessera(Color.GREEN);
		tavolaDaGioco[6][8] = new Tessera(Color.GREEN);
		
		tavolaDaGioco[7][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[7][2] = new Tessera(Color.CYAN);
		tavolaDaGioco[7][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][4] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][5] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][6] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][7] = new Tessera(Color.GREEN);
		tavolaDaGioco[7][8] = new Tessera(Color.GREEN);
		
		tavolaDaGioco[8][0] = new Tessera(Color.GREEN);
		tavolaDaGioco[8][1] = new Tessera(Color.YELLOW);
		tavolaDaGioco[8][2] = new Tessera(Color.GREEN);
		tavolaDaGioco[8][3] = new Tessera(Color.GREEN);
		tavolaDaGioco[8][4] = new Tessera(Color.CYAN);
		tavolaDaGioco[8][5] = new Tessera(Color.GREEN);
		tavolaDaGioco[8][6] = new Tessera(Color.GREEN);
		tavolaDaGioco[8][7] = new Tessera(Color.CYAN);
		tavolaDaGioco[8][8] = new Tessera(Color.GREEN);
		
		
	}
	
}

