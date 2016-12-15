package esercizio_esame_3;

public class Direttore extends Impiegato {
	int anno_nomina;

	public Direttore(String nome, String cognome, String residenza, Sede sede, int anno_nomina) {
		super(nome, cognome, residenza, sede);
		this.anno_nomina = anno_nomina;
	}
}
