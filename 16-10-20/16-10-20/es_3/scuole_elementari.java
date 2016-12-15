package es_3;
public class scuole_elementari {
	public static void main(String[] args) {
		// TEST PER VERIFICARE SE LE CLASSE CREATE FUNZIONANO
		System.out.println("Creazione Scuola, Insegnante e Classe..\n");
		Scuola via_bachelet = new Scuola("G.B.Vico", "via Bachelet", "LT");
		Insegnante pina_valenza = new Insegnante("Giuseppa", "Valenza", 1999, via_bachelet);
		Classe prima = new Classe(via_bachelet, "1A", pina_valenza, 22);
		System.out.println("SCUOLA");
		via_bachelet.stampa();
		System.out.println("\nINSEGNANTE");
		pina_valenza.stampa();
		System.out.println("\nCLASSE");
		prima.stampa();
	}
}