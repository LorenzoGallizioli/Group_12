package Game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Classe che definisce il giocatore
 * @author Davide
 *
 */
public class Giocatore {
	
	private String nome;
	private int id;
	private int punti;
	private Boolean giocatoreSedia;
	
	private Tessera[][] obiettivo = new Tessera[6][5];
	
	/**
	 * Il costruttore della classe Giocatore.
	 * 
	 * @param nome
	 * 	 Il nome del giocatore.
	 * @param id
	 * 	 L'id del giocatore.
	 * @param punti
	 * 	 I punti del giocatore.
	 * @param giocatore_sedia
	 * 	 TRUE se il giocatore ha la sedia, FALSE altrimenti.
	 */
	
	
	public Giocatore(String nome, int id, int punti, Boolean giocatore_sedia) {
		this.nome = nome;
		this.id = id;
		this.punti = punti;
		this.giocatoreSedia = giocatore_sedia;
		this.obiettivo = generaObiettivoPersonale();
	
	}
	
	//metodo per generare ogni volta che viene chiamato un obiettivo personale
	public Tessera[][] generaObiettivoPersonale() {
		Color[] colori = {Color.green, Color.WHITE, Color.yellow, Color.CYAN, Color.blue, Color.PINK};
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				int prob = rand.nextInt(10);
				if (prob < 9) {
					obiettivo[i][j] = new Tessera(Color.BLACK,false);
				}
				else {
					int coloreRand = rand.nextInt(6);
					obiettivo[i][j] =new Tessera(colori[coloreRand],true);
				}
			}
		}
		return obiettivo;
	}
	
	

	public Tessera[][] getObiettivo() {
		return obiettivo;
	}


	public void setObiettivo(Tessera[][] obiettivo) {
		this.obiettivo = obiettivo;
	}


	/**
	 * Restituisce il nome del giocatore.
	 * 
	 * @return
	 * 	 Nome del giocatore.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Imposta il nome del giocatore.
	 * 
	 * @param nome
	 * 	 Nome da impostare.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce l'id del giocatore.
	 * 
	 * @return
	 * 	 Id del giocatore.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Imposta l'id del giocatore.
	 * 
	 * @param id
	 * 	 Id da impostare.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Restituisce i punti del giocatore.
	 * 
	 * @return
	 * 	 Punti del giocatore.
	 */
	public int getPunti() {
		return punti;
	}

	/**
	 * Aggiungi punti.
	 * 
	 * @param punti
	 * 	 Punti da aggiungere.
	 */
	public void addPunti(int punti) {
		this.punti += punti;
	}

	/**
	 * Restituisce se il giocatore ha o meno la sedia.
	 * 
	 * @return
	 * 	 TRUE se ha la sedia, FALSE altrimenti.
	 */
	public Boolean getGiocatoreSedia() {
		return giocatoreSedia;
	}

	/**
	 * Assegna o meno la sedia.
	 * 
	 * @param giocatoreSedia
	 * 	 TRUE assegna, FALSE altrimenti.
	 */
	public void setGiocatoreSedia(Boolean giocatoreSedia) {
		this.giocatoreSedia = giocatoreSedia;
	}
	
}
