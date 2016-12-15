package es_3_2;

public class Persona {
	private String nome;
	private String cognome;
	private String data_di_nascita;
	private String nazionalita;
	private String residenza;
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getData_di_nascita() {
		return data_di_nascita;
	}
	public String getNazionalita() {
		return nazionalita;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	public void stampa() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cognome: "+this.cognome);
		System.out.println("Data di nascita: "+this.data_di_nascita);
		System.out.println("Nazionalità: "+this.nazionalita);
		System.out.println("Residenza: "+this.residenza);
	}
}