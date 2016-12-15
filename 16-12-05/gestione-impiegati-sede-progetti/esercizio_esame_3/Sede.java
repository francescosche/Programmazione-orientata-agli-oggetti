package esercizio_esame_3;

public class Sede {
	private String codice;
	private String citta;
	public String getCitta() {
		return citta;
	}
	public Sede(String codice, String citta) {
		super();
		this.codice = codice;
		this.citta = citta;
	}
	@Override
	public String toString() {
		return codice+" a "+citta;
	}
}
