package gestione_studenti_corsi;

public class Scientifica extends Facolta {
	private int num_laboratori;

	public Scientifica(String nome, int num_laboratori) {
		super(nome);
		this.num_laboratori = num_laboratori;
	}
	
	public String toString() {
		return nome+" con "+num_laboratori+" laboratori";
	}
}
