package gestione_studenti_corsi;

public class Corso {
	private String nome;
	int num_studenti;
	
	public Corso(String nome, int num_studenti) {
		super();
		this.nome = nome;
		this.num_studenti = num_studenti;
	}
	public String toString() {
		return nome+" di "+num_studenti+" studenti";
	}
}
