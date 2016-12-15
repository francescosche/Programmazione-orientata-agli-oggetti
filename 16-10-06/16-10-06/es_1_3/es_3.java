package es_1_3;
import java.io.*;
public class es_3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserendo un anno, viene verificato se è bisestile o meno");
        System.out.print("Inserisci un anno: ");
        String input = in.readLine();
        int anno = Integer.parseInt(input);
        if((anno%4==0 && anno%100!=0) || anno%400==0)
        	System.out.println("Anno bisestile");
        else
        	System.out.println("Anno NON bisestile");
    }
}