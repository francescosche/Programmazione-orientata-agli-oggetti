package es_1_6;
import java.io.*;
public class es_6 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserendo due stringhe, viene restituita quella che ha valore ASCII maggiore ed il valore stesso");
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = in.readLine();
        int val1=0;
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = in.readLine();
        int val2=0;
        for(int i=0; i<stringa1.length(); i++)
        	val1 += stringa1.charAt(i);
        for(int i=0; i<stringa2.length(); i++)
        	val2 += stringa2.charAt(i);
        if(val1 > val2)
        	System.out.println(stringa1+" "+val1);
        else
        	System.out.println(stringa2+" "+val2);
    }
}