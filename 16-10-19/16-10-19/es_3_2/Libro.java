package es_3_2;

public class Libro {
	public Persona[] autori;
	public String titolo;
	public int anno_pubblicazione;
	String editore;
	int prezzo;
	public Persona[] getAutori() {
		return autori;
	}
	public String getTitolo() {
		return titolo;
	}
	public int getAnno_pubblicazione() {
		return anno_pubblicazione;
	}
	public String getEditore() {
		return editore;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public void stampa() {
		System.out.println("Autori: "+autori);
		System.out.println("Titolo: "+this.titolo);
		System.out.println("Anno pubblicazione: "+this.anno_pubblicazione);
		System.out.println("Editore: "+this.editore);
		System.out.println("Prezzo: "+this.prezzo);
	}
}