package Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class Client implements Runnable {
	
	Socket socket;
	InputStream dati_input;
	Scanner scanner;
	PrintWriter dati_output;
	static Map<String, String> prenotazioni = Main.prenotazioni;
	
	public Client(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			dati_input = socket.getInputStream();
			scanner = new Scanner(dati_input);
			String nome = scanner.nextLine();
			String cognome = scanner.nextLine();
			String posto = scanner.nextLine();
			dati_output = new PrintWriter(socket.getOutputStream());
			if(prenota_posto(nome, cognome, posto)) {
				dati_output.println("Il posto è stato prenotato correttamente, grazie.");
				System.out.println("Nuova prenotazione ricevuta.\n\tNuovo elenco prenotazioni:\n\t"+prenotazioni.toString());
			}else{
				dati_output.println("Il posto non è disponibile o i dati inseriti sono errati, riprova.");
				System.out.println("Nuova prenotazione ricevuta.\n\tIl posto era occupato o i dati inseriti errati");
			}
			dati_output.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println("Nessun dato ricevuto dal client");
		}
	}
	
	public synchronized static boolean prenota_posto(String nome, String cognome, String posto) {
		if(!(nome.length() > 1 && cognome.length() > 1 && posto.length() >= 2 && posto.length() <=3)) {
			return false;
		}else if(!((posto.charAt(0) >= 'A' && posto.charAt(0) <= 'F') || (posto.charAt(0) >= 'a' && posto.charAt(0) <= 'f'))) {
			return false;
		}else if(!(Integer.parseInt(posto.substring(1)) > 0 && Integer.parseInt(posto.substring(1)) <= 20)) {
			return false;
		}else if(prenotazioni.containsKey(posto.toUpperCase())) {
			return false;
		} else {
			prenotazioni.put(posto.toUpperCase(), nome+" "+cognome);
		}
		return true;
	}
	
}