package es_1_1;
import java.io.*;
public class es_1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.println("Inserendo due stringhe, verificare se la prima contiene la seconda o viceversa");
        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = r.readLine();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = r.readLine();
        if(stringa1.contains(stringa2) || stringa2.contains(stringa1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}