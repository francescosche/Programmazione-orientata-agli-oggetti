package database_studenti_server;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FinestraStartStop {
	
	// definisco le costanti che conterranno il testo dei pulsanti
	public static final String START = "Start"; 
	public static final String STOP = "Stop"; 
	
	// creo i pulsanti che saranno accessibili anche dal metodo Listener
	JButton start = new JButton(START);
	JButton stop = new JButton(STOP);
	
	// credo il frame che sarà accessibile anche all'interno dei metodi
	JFrame frame;
	
	// prendo la console del Main all'interno della quale scrivere i messaggi
	Console console = Main.console;
	
	// metodo costruttore della finestra con i tasti di avvio e stop del server
	public FinestraStartStop() {
		// creo la finestra
		frame = new JFrame("Avvio server");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		// disabilito, all'avvio, il tasto per fermare il server
		stop.setEnabled(false);
		// collego le azioni del Listener ai pulsanti Start e Stop
		start.addActionListener(new Listener());
		stop.addActionListener(new Listener());
		// aggiungo i pulsanti nel container
		container.add(start);
		container.add(stop);
		// visualizzo la grafico finale
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		// creata la grafica, attendo che l'utente prema il tasto di avvio, e lo scrivo sulla console
		console.scrivi("Attendo l'avvio del server...");
	}
	
	// metodo di ascolto delle azioni fatte sui tasti nella FinestraStartStop()
	class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Server server = new Server();
			JButton button = (JButton) e.getSource();
			switch(button.getText()) {
				// in caso sia stato premuto START
				case START:
					// scrivo sulla console il messaggio di avvio
					console.scrivi("Avvio il server...");
					// faccio partire un nuovo Thread che si mette in attesa dei client
					Thread server_thread = new Thread(server);
					server_thread.start();
					// inverto i pulsanti attivi
					start.setEnabled(false);
					stop.setEnabled(true);
					break;
				// in caso sia stato premuto STOP
				case STOP:
					// blocco il server
					server.stop();
					// inverto i pulsanti attivi
					start.setEnabled(true);
					stop.setEnabled(false);
					break;
			}
		}
	}
	
}