package Game;

public class Tavola {
	
	static int  numPlayers = 0;
	public Tessera[][] tavolaDaGioco = new Tessera[9][9];
	
	public void Creatavola() {
		
		tavolaDaGioco[1][1] = new Tessera(null);
		tavolaDaGioco[1][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[1][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[2][1] = new Tessera(null);
		tavolaDaGioco[2][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[3][1] = new Tessera(null);
		tavolaDaGioco[3][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[3][1] = new Tessera(null);
		tavolaDaGioco[3][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[3][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[4][1] = new Tessera(null);
		tavolaDaGioco[4][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[2][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[4][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[5][1] = new Tessera(null);
		tavolaDaGioco[5][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[5][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[6][1] = new Tessera(null);
		tavolaDaGioco[6][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[6][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[7][1] = new Tessera(null);
		tavolaDaGioco[7][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[7][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[8][1] = new Tessera(null);
		tavolaDaGioco[8][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[8][9] = new Tessera(Colore.VERDE);
		
		tavolaDaGioco[9][1] = new Tessera(null);
		tavolaDaGioco[9][2] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][3] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][4] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][5] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][6] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][7] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][8] = new Tessera(Colore.VERDE);
		tavolaDaGioco[9][9] = new Tessera(Colore.VERDE);
		
	}
}
