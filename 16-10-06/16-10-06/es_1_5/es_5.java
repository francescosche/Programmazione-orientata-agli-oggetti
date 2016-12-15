package es_1_5;
import java.io.*;
public class es_5 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserendo due stringhe, viene stampato il rapporto delle loro lunghezze");
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = in.readLine();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = in.readLine();
        float len1 = stringa1.length();
        float len2 = stringa2.length();
        float rapporto = len1/len2;
        System.out.println("Il rapporto fra le due stringhe è di "+rapporto);
    }
}