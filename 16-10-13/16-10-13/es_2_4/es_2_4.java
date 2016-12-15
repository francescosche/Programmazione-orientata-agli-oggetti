package es_2_4;
import java.io.*;
import java.util.*;
public class es_2_4 {

	 /*
	 * METODI COPIATI DA es_2_3 DEL 13 OTTOBRE 2016
	 */
	
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
	
	/*
	 * FINE DEI METODI COPIATI
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Leggo il file \"input4.txt\"\n\nLa matrice letta è:");
		BufferedReader file = new BufferedReader(new FileReader("16:10:13/es_2_4/input4.txt"));
		String linea = file.readLine();
		StringTokenizer word = new StringTokenizer(linea);
		int r = Integer.parseInt(word.nextToken());
		int c = Integer.parseInt(word.nextToken());
		double[][] mat = new double[r][c];
		for(int i = 0; i < r; i++) {
			linea = file.readLine();
			word = new StringTokenizer(linea);
			for(int j = 0; j < c; j++) {
				mat[i][j] = Double.parseDouble(word.nextToken());
			}
		}
		file.close();
		stampaMatrice(mat);
		System.out.println("\nLa matrice differenza è:");
		stampaMatrice(differenzaVicini(mat));
	}
}