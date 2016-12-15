package database_studenti_server;

import java.io.IOException;

public class Main {
	
	static Console console;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		console = new Console();
		new FinestraStartStop();
	}
	
}