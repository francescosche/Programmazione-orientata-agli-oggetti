package esercizio_esame_3;

public class Impiegato {
	private final String nome;
	private final String cognome;
	private String residenza;
	private Sede sede;
	public Impiegato(String nome, String cognome, String residenza, Sede sede) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.residenza = residenza;
		this.sede = sede;
	}
	public String getResidenza() {
		return residenza;
	}
	public Sede getSede() {
		return sede;
	}
	@Override
	public String toString() {
		return nome+" "+cognome+" di "+residenza+" lavora nella sede "+sede.toString();
	}
}