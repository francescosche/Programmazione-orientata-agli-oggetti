package esercizio_esame_3;

import java.util.*;

public class Prova {
	public static void main(String[] args) {
		Sede s1 = new Sede("SCHFNC", "Latina");
		Sede s2 = new Sede("MNTMNL", "Roma");
		Impiegato i1 = new Impiegato("Francesco", "Schettino", "Latina", s1);
		Impiegato i2 = new Impiegato("Marian", "Mentel", "Roma", s1);
		Impiegato i3 = new Impiegato("Adele", "Marlons", "Latina", s2);
		Impiegato i4 = new Impiegato("Aurora", "Mentel", "Roma", s1);
		Set<Impiegato> set_imp1 = new HashSet<Impiegato>();
		set_imp1.add(i1);
		set_imp1.add(i2);
		set_imp1.add(i4);
		
		Set<Impiegato> set_imp2 = new HashSet<Impiegato>();
		set_imp2.add(i3);
		set_imp2.add(i4);
		
		System.out.println("Impiegati fuori sede del set 1:" );
		Set<Impiegato> i = Operazioni.fuoriSede(set_imp1);
		Iterator<Impiegato> ii = i.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next().toString());
		}
		
		System.out.println("\nImpiegati fuori sede del set 2:" );
		Set<Impiegato> iii = Operazioni.fuoriSede(set_imp2);
		Iterator<Impiegato> iiii = iii.iterator();
		while(iiii.hasNext()) {
			System.out.println(iiii.next().toString());
		}
		
		Set<Progetto> set_pro1 = new HashSet<Progetto>();
		Progetto p1 = new Progetto("PRO1", "progetto 1", set_imp1);
		set_pro1.add(p1);
		System.out.println("\nTutti gli impiegati di 1 progetto sono nella stessa sede?");
		System.out.println(Operazioni.stessaSede(set_pro1));
		
		Set<Progetto> set_pro2 = new HashSet<Progetto>();
		Progetto p2 = new Progetto("PRO2", "progetto 2", set_imp2);
		set_pro2.add(p2);
		System.out.println("\nTutti gli impiegati di 1 progetto sono nella stessa sede?");
		System.out.println(Operazioni.stessaSede(set_pro2));
		
		Set<Progetto> set_pro3 = new HashSet<Progetto>();
		set_pro3.add(p1);
		set_pro3.add(p2);
		System.out.println("\nTutti gli impiegati di 1 progetto sono nella stessa sede?");
		System.out.println(Operazioni.stessaSede(set_pro3));

		System.out.println("\n"+i1.toString()+"\nPrima dello spostamento:\n\tSi trovava al progetto1? "+p1.impiegati.contains(i1)+"\n\tSi trovava al progetto2? "+p2.impiegati.contains(i1));
		Operazioni.spostaImpiegato(i1, p1, p2);
		System.out.println("Dopo lo spostamento:\n\tSi trovava al progetto1? "+p1.impiegati.contains(i1)+"\n\tSi trovava al progetto2? "+p2.impiegati.contains(i1));
	}
}
