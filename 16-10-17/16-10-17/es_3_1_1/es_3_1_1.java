package es_3_1_1;
import java.io.*;

class Libro {
	String titolo;
	float prezzo;
	public Libro(String titolo) {
		this.titolo = titolo;
	}
	public void modificaPrezzo() throws IOException {
		System.out.println("Stai modificando il prezzo del libro.\nInserisci il nuovo prezzo:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String prezzo = r.readLine();
		this.prezzo = Float.parseFloat(prezzo);
	}
	public void leggiProprieta() {
		System.out.println("Il libro si intitola \""+this.titolo+"\" e costa "+this.prezzo+" euro.");
	}
}

public class es_3_1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Come si chiama il libro che vuoi inserire?");
		String titolo = r.readLine();
		Libro book = new Libro(titolo);
		book.modificaPrezzo();
		book.leggiProprieta();
	}
}