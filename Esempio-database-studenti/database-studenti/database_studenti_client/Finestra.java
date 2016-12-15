package database_studenti_client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Finestra {
	public Finestra() throws FileNotFoundException {
		JFrame frame = new JFrame("Gestione studenti");
		Container container = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTable tabella = crea_tabella();
		container.setLayout(new BorderLayout());
		container.add(tabella.getTableHeader(), BorderLayout.NORTH);
		container.add(tabella, BorderLayout.CENTER);
		container.add(new JLabel("East"), BorderLayout.EAST);
		Login.frame.setVisible(false);
		frame.pack();
		frame.setVisible(true);
	}
	private JTable crea_tabella() throws FileNotFoundException {
		String[] colonne = {"Nome", "Cognome", "Matricola", "Anno accademico"};
		Set<Studente> elenco_studenti = Studente.elenco_studenti();
		String[][] studenti = new String[elenco_studenti.size()+1][colonne.length];
		Iterator<Studente> students = elenco_studenti.iterator();
		int i;
		for(i = 0; i<elenco_studenti.size(); i++) {
			Studente studente = students.next();
			studenti[i][0] = studente.nome;
			studenti[i][1] = studente.cognome;
			studenti[i][2] = studente.matricola;
			studenti[i][3] = studente.anno_accademico;
		}
		return new JTable(studenti, colonne);
	}
}