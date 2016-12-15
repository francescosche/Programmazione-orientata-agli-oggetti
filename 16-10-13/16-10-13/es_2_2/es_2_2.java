package es_2_2;
import java.io.*;
public class es_2_2 {
	public static double[][] generaMatrice(int n, int m) {
		double[][] mat = new double[n][m];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				mat[i][j] = Math.random()*100;
			}
		}
		return mat;
	}
	public static void stampaMatrice(double[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void stampaArray(double[] list) {
		int size = list.length;
		for(int i = 0; i < size; i++) {
			System.out.println(list[i]);
		}
	}
	public static double[] diagonale (double[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		double[] list = new double[r];
		if(r == c) {
			for(int i = 0; i < r; i++) {
				list[i] = mat[i][i];
			}
		}else{
			System.out.println("ERRORE\nPer ricavare la diagonale della matrice, questa deve essere quadrata");
		}
		return list;
	}
	public static double sommaArray(double[] list) {
		double somma = 0;
		int size = list.length;
		for(int i = 0; i < size; i++) {
			somma += list[i];
		}
		return somma;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Inserisci il primo intero: ");
		int a = Integer.parseInt(r.readLine());
		System.out.print("Inserisci il secondo intero: ");
		int b = Integer.parseInt(r.readLine());
		System.out.println("\nLa matrice generata è:");
		double[][] mat = generaMatrice(a, b); 
		stampaMatrice(mat);
		System.out.println("\nLa sua diagonale è:");
		double[] list = diagonale(mat);
		stampaArray(list);
		System.out.println("\nE la somma della sua diagonale è:");
		System.out.println(sommaArray(list));
	}
}