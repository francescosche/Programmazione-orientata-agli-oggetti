package vendita_biglietti;
import java.util.*;

public class Biglietto {
	private String nome_evento;
	private String citta;
	Set<Offerta> offerte = new HashSet<Offerta>();
	
	public Biglietto(String nome_evento, String citta) {
		super();
		this.nome_evento = nome_evento;
		this.citta = citta;
	}
	
	public void addOfferta(Offerta offerta) {
		offerte.add(offerta);
	}

	@Override
	public String toString() {
		return nome_evento+" a "+citta;
	}
}
