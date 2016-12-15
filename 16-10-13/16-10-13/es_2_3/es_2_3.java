package es_2_3;
import java.io.*;
public class es_2_3 {

	 /*
	 * METODI COPIATI DA es_2_2 DEL 13 OTTOBRE 2016
	 */
	
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
	
	/*
	 * FINE DEI METODI COPIATI
	 */
	
	public static double[][] differenzaVicini(double[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		double[][] diff = new double[r][c];
		double somma = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = i-1; k <= i+1; k++) {
					for(int l = j-1; l <= j+1; l++) {
						if(k>=0 && k<r && l>=0 && l<c && (k!=i || l!=j)) {
							somma += mat[k][l];
						}
					}
				}
				diff[i][j] = mat[i][j]-somma;
				somma = 0;
			}
		}
		return diff;
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
		System.out.println("\nLa matrice differenza è:");
		stampaMatrice(differenzaVicini(mat));
	}
}