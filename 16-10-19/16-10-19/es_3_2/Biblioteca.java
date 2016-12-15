/*

oooooooooo.         .o.          oooooooooooo       .o.       ooooooooo.   oooooooooooo
`888'   `Y8b       .888.         `888'     `8      .888.      `888   `Y88. `888'     `8
 888      888     .8"888.         888             .8"888.      888   .d88'  888        
 888      888    .8' `888.        888oooo8       .8' `888.     888ooo88P'   888oooo8   
 888      888   .88ooo8888.       888    "      .88ooo8888.    888`88b.     888    "   
 888     d88'  .8'     `888.      888          .8'     `888.   888  `88b.   888       o
o888bood8P'   o88o     o8888o    o888o        o88o     o8888o o888o  o888o o888ooooood8


QUESTO ESERCIZIO è ANCORA INCOMPLETO                                                              

*/
package es_3_2;
import java.io.*;

public class Biblioteca {
	static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	public final int INFTY = 99999;
	public Libro[] libri = new Libro[INFTY];
	public Persona[] autori = new Persona[INFTY];
	private static int numero_libri = 0;
	public String toString() {
		return ""+numero_libri;
	}
	public static Boolean aggiungi_libro() {
		return true;
		
		
		/*
		 * A:
		 * 		chiedere se l'autore del libro è già presente o no (si/no/visualizza_elenco)
		 * 		se è presente > inserisci codice
		 * 		se non è presente > inserisci autore
		 * 		se visualizza_elenco > chiedere se l'autore del libro è già presente o no (si/no)
		 *	 		se è presente > inserisci codice
		 * 			se non è presente > inserisci autore
		 * 		inserisci autore nella posizione dell'array
		 * 		incrementa il numero di autori
		 * chiedere se è presente un altro autore
		 * 		se è presente > torna ad A
		 * inserire il titolo del libro
		 * inserire l'anno di pubblicazione del libro
		 * inserire l'editore del libro
		 * se il libro viene inserito correttamente tramite il costruttore
		 * 		aumenta numero_libri di 1
		 * 		return true
		 * altrimenti
		 * 		return false
		 */
		
		
		
	}
	public static void rimuovi_libro(String titolo) {
		
		
		
		/*
		 * per ogni libro
		 * 		verifica se il titolo è uguale a quello inserito
		 * 			se è uguale > elimina libro
		 * 			registra l'indice in una variabile
		 * 			scala l'ultimo libro nella posizione attuale
		 * se si arriva alla fine e il libro non è presente
		 * 		messaggio d'errore
		 * 		re-inserisci il titolo
		 * 		richiama rimuovi_libro con il nuovo titolo
		 */
		
		
		
	}
	public static Libro[] elenco_libri(String autore) {
		return null;
		
		
		/*
		 * se il nome dell'autore è presente
		 * 		crea l'array di libri di grandezza massima numero_libri
		 * 		per ogni libro
		 * 			se il nome dell'autore è uguale a quello inserito
		 * 				inseriscilo nell'array
		 * 		restituisci l'array
		 * altrimenti
		 * 		messaggio d'errore
		 * 		re-inserisci il nome dell'autore
		 * 		richiama elenco_libro con il nuovo nome
		 */
		
		
		
	}
	public static void stampa_elenco(String tipo) throws IOException {
		switch(tipo) {
			case "autori":

				
				
				/*
				 * per ogni libro presente nell'elenco
				 * 		stampa tutti i dati
				 */
				
				
				
				break;
			case "libri":
				
				
				
				/*
				 * per ogni libro presente nell'elenco
				 * 		stampa tutti i dati
				 */
				
				
				
				break;
			default:
				System.out.println("Inserisci un tipo di elenco valido: ");
				tipo = r.readLine();
				stampa_elenco(tipo);
				break;
		}
	}
	public static void salva() {
		
	}
}