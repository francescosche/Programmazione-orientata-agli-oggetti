package database_studenti_server;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
	
	public static Console console = Main.console;
	Socket socket;
	Scanner lettore;
	
	public Client(Socket socket, Server server) throws IOException {
		while(true) {
			lettore = new Scanner(socket.getInputStream());
			console.scrivi(lettore.nextLine());
		}
	}
	
	public void run() {
		boolean client_attivo = true;
		while(client_attivo) {
			try {
				lettore = new Scanner(socket.getInputStream());
				console.scrivi(lettore.nextLine());
			} catch (IOException e) {
				console.scrivi("Errore durante la ricezione di dati dal client.\nChiudo la connessione con il client.");
				client_attivo = false;
			}
		}
	}
	
	void invia() {
		
	}
	
	boolean chiuso() {
		return socket.isClosed();
	}
	
	void chiudi() throws IOException {
		socket.close();
	}
	
}