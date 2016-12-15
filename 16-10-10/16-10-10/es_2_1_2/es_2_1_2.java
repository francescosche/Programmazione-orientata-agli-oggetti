package es_2_1_2;
import java.io.*;
public class es_2_1_2 {
	public static int mcd(int x, int y) {
		int r = x%y;
		if(r == 0) {
			return y;
		}else{
			return mcd(y,r);
		}
	}
	
	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserendo due valori, il programma calcola il Massimo Comune Divisore fra i due");
		System.out.print("Inserisci il valore di x: ");
		String xs = in.readLine();
		int x = Integer.parseInt(xs);
		System.out.print("Inserisci il valore di y: ");
		String ys = in.readLine();
		int y = Integer.parseInt(ys);
		System.out.println("Il massimo comune divisore fra "+x+" e "+y+" è "+mcd(x,y));
	}
}