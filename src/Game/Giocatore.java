package Game;

public class Giocatore {
	
	
	
	private String nome;
	private int id;
	private int punti;
	

	private Boolean giocatoreSedia;
	private Boolean finePartita;
	
	public Giocatore(String nome, int id, int punti, Boolean giocatoreSedia, Boolean finePartita) {
		super();
		this.nome = nome;
		this.id = id;
		this.punti = punti;
		this.giocatoreSedia = giocatoreSedia;
		this.finePartita = finePartita;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public Boolean getGiocatoreSedia() {
		return giocatoreSedia;
	}

	public void setGiocatoreSedia(Boolean giocatoreSedia) {
		this.giocatoreSedia = giocatoreSedia;
	}

	public Boolean getFinePartita() {
		return finePartita;
	}

	public void setFinePartita(Boolean finePartita) {
		this.finePartita = finePartita;
	}
}
