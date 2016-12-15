package es_1_2;
import java.io.*;
public class es_2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserendo una stringa, viene restituita la stringa con le lettere maiuscolo o minuscole in maniera alternata");
        System.out.print("Inserire la stringa: ");
        String stringa = in.readLine();
        int i = 0;
        while(i<stringa.length()) {
            if(i%2==0)
                System.out.print(stringa.substring(i,i+1).toUpperCase());
            else
                System.out.print(stringa.charAt(i));
            i = i+1;
        }
    }
}