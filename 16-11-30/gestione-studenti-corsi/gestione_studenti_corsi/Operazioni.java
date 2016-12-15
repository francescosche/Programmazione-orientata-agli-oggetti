package gestione_studenti_corsi;

import java.util.*;
public class Operazioni {
	public static double NumeroMedioStudenti(Docente d) {
		int dim = d.corsi.size(), totale = 0;
		Set<Corso> copia = new HashSet<Corso>();
		copia.addAll(d.corsi);
		for(int i=0; i<dim; i++) {
			Corso corso = copia.iterator().next();
			totale += corso.num_studenti;
			copia.remove(corso);
		}
		return totale/dim;
	}
}