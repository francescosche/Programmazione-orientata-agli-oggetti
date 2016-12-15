package es_2_1;
import java.io.*;
public class es_2_1 {
	public static String inverti(String str) {
		if(str.length() > 0) {
			return inverti(str.substring(1))+str.substring(0,1);
		}else{
			return "";
		}
	}
	public static String concatena(String str1, String str2) {
		if(str1.length() > 0 || str2.length() > 0) {
			if(str1.length() > 0) {
				return str1.substring(0,1)+concatena(str1.substring(1), str2);
			}else{
				return str2.substring(0,1)+concatena("", str2.substring(1));
			}
		}else{
			return "";
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Inserisci la prima stringa: ");
		String str1 = r.readLine();
		System.out.print("Inserisci la seconda stringa: ");
		String str2 = r.readLine();
		System.out.println(concatena(str1, inverti(str2)));
	}
}