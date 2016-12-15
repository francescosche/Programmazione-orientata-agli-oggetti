package es_3;

public class Scuola {
	public final String nome;
	public final String indirizzo;
	public final String provveditorato;
	public Scuola(String nome, String indirizzo, String provveditorato) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.provveditorato = provveditorato;
	}
	public String getNome() {
		return nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public String getProvveditorato() {
		return provveditorato;
	}
	public void stampa() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Indirizzo: "+this.indirizzo);
		System.out.println("Provveditorato: "+this.provveditorato);
	}
}
