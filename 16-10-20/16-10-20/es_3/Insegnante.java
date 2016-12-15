package es_3;

public class Insegnante {
	public final String nome;
	public final String cognome;
	public final int annoVincita;
	public final Scuola scuola;
	public Insegnante(String nome, String cognome, int annoVincita, Scuola scuola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoVincita = annoVincita;
		this.scuola = scuola;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getAnnoVincita() {
		return annoVincita;
	}
	public Scuola getScuola() {
		return scuola;
	}
	public void stampa() {
		System.out.println("Nome: "+nome);
		System.out.println("Cognome: "+cognome);
		System.out.println("Anno di vincita: "+annoVincita);
		System.out.println("Scuola: "+scuola.getNome());
	}
}
