package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		prenotazione();
	}
	
	static void  prenotazione() throws IOException {
		Socket socket = new Socket("127.0.0.1", 9876);
		if(!socket.isClosed()) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Cognome: ");
			String cognome = scanner.nextLine();
			System.out.print("Posto: ");
			String posto = scanner.nextLine();
			scanner.close();
			PrintWriter server = new PrintWriter(socket.getOutputStream());
			server.println(nome);
			server.println(cognome);
			server.println(posto);
			server.flush();
			Scanner scanne = new Scanner(socket.getInputStream());
			while(scanne.hasNextLine())
				System.out.println(scanne.nextLine());
			scanne.close();
			server.close();
			socket.close();
		} else {
			System.out.println("Non riesco a connettermi al server");
		}}
}