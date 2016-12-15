package gestione_studenti_corsi;

import java.util.*;

public class Prova {
	public static void main(String[] args) {
		Corso analisi = new Corso("Analisi I", 70);
		Corso lettere = new Corso("Lettere antiche", 10);
		Corso teoria_dei_sistemi = new Corso("Teoria dei Sistemi", 30);
		Corso cinese = new Corso("Cinese", 40);
		Scientifica ingegneria = new Scientifica("Ingegneria informatica", 4);
		Umanistica lingue = new Umanistica("Lingue orientali", 2);
		Set<Corso> scientifiche = new HashSet<Corso>();
		scientifiche.add(analisi);
		scientifiche.add(teoria_dei_sistemi);
		Set<Corso> umanistiche = new HashSet<Corso>();
		umanistiche.add(lettere);
		umanistiche.add(cinese);
		Docente iocchi = new Docente("Luca", "Iocchi", ingegneria, scientifiche);
		Docente chong = new Docente("Marco", "Chong", lingue, umanistiche);
		System.out.println(iocchi.nome+" "+iocchi.cognome+" ha una media degli studenti di "+Operazioni.NumeroMedioStudenti(iocchi));
		System.out.println(chong.nome+" "+chong.cognome+" ha una media degli studenti di "+Operazioni.NumeroMedioStudenti(chong));
	}
}
