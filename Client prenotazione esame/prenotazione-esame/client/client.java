package client;

import java.io.*;
import java.net.*;
import java.util.*;

public class client {
	 public static void main(String args[]) throws IOException {
		 try {
		 	Socket socket = new Socket("188.213.173.201", 4444);
		 	OutputStream output = socket.getOutputStream();
		 	InputStream input = socket.getInputStream();
		 	PrintWriter p = new PrintWriter(output);
		 	
		 	p.println("Schettino");
		 	p.println("Francesco");
		 	p.println("1713519");
		 	p.println("schettino.francesco@live.it");
		 	
		 	Scanner scanner = new Scanner(input);
		 	String stringa = scanner.next();
		 	System.out.println("Stringa: "+stringa);
		 	scanner.close();

//		 	BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//		 	output.flush();
//		 	System.out.println(reader.readLine());
		 	
		 	input.close();
		 	output.close();
		 	socket.close();
		 	
		 } catch(IOException e){
			 e.printStackTrace();
		 }
	 }
}