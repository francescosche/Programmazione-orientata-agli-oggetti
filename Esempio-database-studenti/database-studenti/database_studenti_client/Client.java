package database_studenti_client;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client {
	public static PrintWriter writer;
	public static Socket socket;
	public static void main(String[] args) throws IOException {
		try {
			socket = new Socket("127.0.0.1", 4444);
			writer = new PrintWriter(socket.getOutputStream());
			if(socket.isConnected()) 
				writer.println("Connessione effettuata");
			else
				writer.println("Connessione non riuscita");
			writer.flush();
			new Login();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Errore durante la connessione al server.\nIl programma verrà chiuso.", "Errore", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}	
	}
}

