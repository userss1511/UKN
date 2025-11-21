package cas9;

import java.util.Scanner;

public class Main {
	
	public static void unesiMatricu(int[][] mat, int m, int n) {
		Scanner unos = new Scanner(System.in);
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
		
	}
	
	
	public static void stampaMatrice(int[][] mat, int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static int zad1(int mat[][], int m, int n) {
		int suma = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if((i % 2 == 0) && (j % 2 != 0)) {
					suma += mat[i][j];
				}
			}
		}
		return suma;
	}

	
	public static void zad2(int[][] mat, int m, int n, int r, int s) {
		int[] temp = new int[m];
		for(int i = 0; i < m; i++) {
			temp[i] = mat[i][r];
		}
		for(int i = 0; i < m; i++) {
			mat[i][r] = mat[i][s];
		}
		
		for(int i = 0; i < m; i++) {
			mat[i][s] = temp[i];
		}
	}
	
	
	public static boolean zad3(int[][] mat, int m, int n) {
		if(m != n) return false;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] != mat[j][i]) return false;
			}
		}
		
		return true;
	}
	
	
	public static boolean zad4PomFun(int[] niz, int n) {
		boolean ind = false;
		for(int br = 1; br <= n; br++) {
			ind = false;
			for(int i = 0; i < n; i++) {
				if(niz[i] == br) ind = true;
			}
			if(ind == false) return false;
		}
		
		return true;
	}
	
	
	public static void zad4(int[][] mat, int m, int n) {
		boolean ind = true;
		
		for(int i = 0; i < m; i++) {
			boolean ind1 = zad4PomFun(mat[i], n);
			if(ind1 == false) ind = false;
		}
		
		if(ind) System.out.println("DA");
		else System.out.println("NE");
		
		
	}
	
	
	public static void zad5(int[][] mat, int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				boolean ind = true;
				if(i-1 >= 0 && j-1 >= 0 && mat[i][j] < mat[i-1][j-1]) ind = false;
				if(i-1 >= 0 && mat[i][j] < mat[i-1][j]) ind = false;
				if(i-1 >= 0 && j+1 < n && mat[i][j] < mat[i-1][j+1]) ind = false;
				if(j-1 >= 0 && mat[i][j] < mat[i][j-1]) ind = false;
				if(j+1 < n && mat[i][j] < mat[i][j+1]) ind = false;
				if(i+1 < n && j-1 >= 0 && mat[i][j] < mat[i+1][j-1]) ind = false;
				if(i+1 < n && j+1 < 0 && mat[i][j] < mat[i+1][j+1]) ind = false;
				
				if(ind) System.out.println(mat[i][j]);
			}
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int[][] mat = new int[m][n];
		unesiMatricu(mat, m, n);
		//stampaMatrice(mat, m, n);
		//System.out.println(zad1(mat, m, n));
		//zad2(mat, m, n, 1, 2);
		//stampaMatrice(mat, m, n);
		//System.out.println(zad3(mat, m, n));
		//zad4(mat, m, n);
		zad5(mat, m, n);
		
	}

}
