package es_1_4;
import java.io.*;
public class es_4 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserendo base e altezza di un triangolo, viene cacolata l'area");
        System.out.print("Inserisci la base: ");
        String input = in.readLine();
        int base = Integer.parseInt(input);
        System.out.print("Inserisci l'altezza: ");
        input = in.readLine();
        int altezza = Integer.parseInt(input);
        System.out.println("L'area del triangolo è "+(base*altezza)/2);
    }
}