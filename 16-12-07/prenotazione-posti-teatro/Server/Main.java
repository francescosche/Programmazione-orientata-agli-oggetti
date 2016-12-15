package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static ServerSocket server_socket;
	static Socket socket;
	static Map<String, String> prenotazioni = new HashMap<String, String>();
	static boolean loop;
	
	public static void main(String[] args) {
		try {
			server_socket = new ServerSocket(9876);
			System.out.println("Il server è stato avviato");
			loop = true;
			while(loop) {
				socket = server_socket.accept();
				Client client = new Client(socket);
				Thread thread = new Thread(client);
				thread.start();
			}
			server_socket.close();
		} catch (IOException e) {
			System.out.println("La porta sulla quale si sta creando il server è già occupata");
		}
	}
	
}