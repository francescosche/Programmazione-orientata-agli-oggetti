package es_3;

public class Classe {
	public final Scuola scuola;
	public final String nome;
	public Insegnante insegnante;
	public int numAlunni;
	public Classe(Scuola scuola, String nome, Insegnante insegnante, int numAlunni) {
		super();
		this.scuola = scuola;
		this.nome = nome;
		this.insegnante = insegnante;
		this.numAlunni = numAlunni;
	}
	public Scuola getScuola() {
		return scuola;
	}
	public String getNome() {
		return nome;
	}
	public Insegnante getInsegnante() {
		return insegnante;
	}
	public int getNumAlunni() {
		return numAlunni;
	}
	public void stampa() {
		System.out.println("Scuola: "+this.scuola.getNome());
		System.out.println("Nome: "+this.nome);
		System.out.println("Insegnante: "+this.insegnante.getNome()+" "+this.insegnante.getCognome());
		System.out.println("Numero alunni: "+this.numAlunni);
	}
}
