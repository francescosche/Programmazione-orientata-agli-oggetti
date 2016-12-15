package gestione_studenti_corsi;

public class Umanistica extends Facolta {
	private int num_biblioteche;

	public Umanistica(String nome, int num_biblioteche) {
		super(nome);
		this.num_biblioteche = num_biblioteche;
	}
	
	public String toString() {
		return nome+" con "+num_biblioteche+" biblioteche";
	}
}
