package esercizio_esame_3;

import java.util.*;

public class Operazioni {
	public static Set<Impiegato> fuoriSede(Set<Impiegato> impiegati) {
		Set<Impiegato> impiegati_fuorisede = new HashSet<Impiegato>();
		Iterator<Impiegato> impiegati_da_controllare = impiegati.iterator();
		while(impiegati_da_controllare.hasNext()) {
			Impiegato impiegato = impiegati_da_controllare.next();
			if(impiegato.getResidenza() != impiegato.getSede().getCitta()) {
				impiegati_fuorisede.add(impiegato);
			}
		}
		return impiegati_fuorisede;
	}
	public static boolean stessaSede(Set<Progetto> progetti) {
		Iterator<Progetto> progetti_da_controllare = progetti.iterator();
		while(progetti_da_controllare.hasNext()) {
			boolean ci_sono_esterni = false;
			Progetto progetto = progetti_da_controllare.next();			
			Iterator<Impiegato> impiegati_da_controllare = progetto.impiegati.iterator();
			Sede sede_del_primo = impiegati_da_controllare.next().getSede();			
			while(impiegati_da_controllare.hasNext()) {				
				if(!(sede_del_primo.equals(impiegati_da_controllare.next().getSede()))) {					
					ci_sono_esterni = true;
					break;
				}
			}
			if(!ci_sono_esterni) {
				return true;
			}
		}
		return false;
	}
	public static void spostaImpiegato(Impiegato impiegato, Progetto progetto_vecchio, Progetto progetto_nuovo) {
		progetto_vecchio.impiegati.remove(impiegato);
		progetto_nuovo.impiegati.add(impiegato);
	}
}