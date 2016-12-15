package es_2_1_1;
import java.io.*;
class es_2_1_1 {
	public static boolean i = true;
	public static String capitalize(String var) {
		if(var.length() == 0) {
			i = true;
			return "";
		}else if(i) {
			i = false;
			return var.substring(0,1).toUpperCase()+capitalize(var.substring(1));
		}else{
			return var.substring(0,1).toLowerCase()+capitalize(var.substring(1));
		}
	}
	
	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserendo una stringa, la funzione capitalize() la trasforma, in maniera ricorsiva, in una stringa con la prima lettera maiuscola ed il resto minuscolo");
		System.out.print("Inserisci il nome: ");
		String nome = in.readLine();
		System.out.println("Il nome, nel formato corretto è: "+capitalize(nome));
	}
}