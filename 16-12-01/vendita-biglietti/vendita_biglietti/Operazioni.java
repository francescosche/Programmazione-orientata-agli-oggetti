package vendita_biglietti;
import java.util.*;

public class Operazioni {
	public static Utente migliorOfferente(Biglietto biglietto) {
		if(biglietto.offerte.isEmpty()) {
			return null;
		}
		int dim = biglietto.offerte.size();
		Utente best_offerente = null;
		double best_prezzo = 0, prezzo_attuale;
		for(int i=0; i<dim; i++) {
			Offerta offerta = biglietto.offerte.iterator().next();
			prezzo_attuale = offerta.prezzo;
			if(prezzo_attuale > best_prezzo) {
				best_prezzo = prezzo_attuale;
				best_offerente = offerta.utente;
			}
		}
		return best_offerente;
	}
	
	public static boolean utenteSbadato(Utente utente) {
		Utente acquirente;
		Set<Biglietto> set_biglietti = new HashSet<Biglietto>();
		set_biglietti.addAll(utente.biglietti);
		int numero_biglietti = set_biglietti.size();
		for(int i=0; i<numero_biglietti; i++) {
			Biglietto biglietto = set_biglietti.iterator().next();
			int numero_offerte = biglietto.offerte.size();
			Set<Offerta> set_offerte = new HashSet<Offerta>();
			set_offerte.addAll(biglietto.offerte);
			for(int j=0; j<numero_offerte; j++) {
				Offerta offerta = set_offerte.iterator().next();
				acquirente = offerta.utente;
				if(utente.equals(acquirente))
					return true;
				set_offerte.remove(offerta);
			}
			set_biglietti.remove(biglietto);
		}
		return false;
	}
}
