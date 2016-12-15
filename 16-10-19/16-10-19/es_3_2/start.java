package es_3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
	public static void main(String[] args) throws IOException {
		int scelta = 0;
		while(scelta != 6) {
			System.out.print(""
					+ "1. Aggiungi libro\n"
					+ "2. Rimuovi libro\n"
					+ "3. Elenco libri di un autore\n"
					+ "4. Stampa elenco (di libri o di autori)\n"
					+ "5. Salva elenco dei libri\n"
					+ "6. Esci\n\n"
					+ "Scelta: "
					+ "");
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			scelta = Integer.parseInt(r.readLine());
			System.out.println();
			switch(scelta) {
				case 1:
					Biblioteca.aggiungi_libro();
					break;
				case 2:
					System.out.print("Inserisci il titolo del libro da rimuovere: ");
					Biblioteca.rimuovi_libro(r.readLine());
					break;
				case 3:
					System.out.print("Inserisci il nome dell'autore di cui vuoi visualizzare i libri: ");
					Biblioteca.elenco_libri(r.readLine());
					break;
				case 4:
					System.out.print("Vuoi visualizzare l'elenco dei libri o degli autori? ");
					Biblioteca.stampa_elenco(r.readLine());
					break;
				case 5:
					Biblioteca.salva();
					break;
				case 6:
					System.out.println("Grazie per avere usato la nostra biblioteca, arrivederci!");
					break;
			}
			if(scelta!= 6)
				System.out.println("\nOk, eseguito.\n");
		}
	}
}
