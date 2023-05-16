package Game;

public class Giocatore {
	
	private String nome;
	private int id;
	private int punti;
	private Boolean giocatoreSedia;
	
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
		super();
		this.nome = nome;
		this.id = id;
		this.punti = punti;
		this.giocatoreSedia = giocatore_sedia;
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
	 * Imposta i punti del giocatore.
	 * 
	 * @param punti
	 * 	 Punti da impostare.
	 */
	public void setPunti(int punti) {
		this.punti = punti;
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
