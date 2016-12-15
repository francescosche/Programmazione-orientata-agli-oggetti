package gestione_studenti_corsi;

import java.util.*;

public class Docente {
	String nome;
	String cognome;
	private Facolta facolta;
	Set<Corso> corsi;
	
	public Docente(String nome, String cognome, Facolta facolta, Set<Corso> corsi) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.facolta = facolta;
		this.corsi = corsi;
	}
	
	public String toString() {
		return nome+" "+cognome+" della facoltà "+facolta.toString();
	}
}
