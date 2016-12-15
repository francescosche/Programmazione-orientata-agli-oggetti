package esercizio_esame_3;

import java.util.*;

public class Progetto {
	String codice;
	String descrizione;
	Set<Impiegato> impiegati;
	public Progetto(String codice, String descrizione, Set<Impiegato> impiegati) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.impiegati = impiegati;
	}
	@Override
	public String toString() {
		return codice+" "+descrizione+" "+impiegati;
	}
}
