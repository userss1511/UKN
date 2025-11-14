package zad1;

import java.util.Scanner;

public class Main {

	public static int[] unesiNiz(int n) {
		Scanner unos = new Scanner(System.in);
		int[] niz = new int[n];
		for(int i = 0; i < n; i++) {
			int el = unos.nextInt();
			niz[i] = el;
		}
		return niz;
	}
	
	public static void stampaNiza(int[] niz) {
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}
	
	public static int brParnih(int[] niz) {
		int br = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] % 2 == 0) br++;
		}
		
		return br;
	}
	
	public static void razdvoj(int[] niz) {
		int[] parni = new int[brParnih(niz)];
		int[] neparni = new int[niz.length - brParnih(niz)];
		int br1 = 0, br2 = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] % 2 == 0) {
				parni[br1] = niz[i];
				br1++;
			}
			else {
				neparni[br2] = niz[i];
				br2++;
			}
		}
	stampaNiza(parni);
	stampaNiza(neparni);
	
	}
			
	public static int count(int[] niz, int k) {
		int brojac = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] == k) brojac++;
		}
		return brojac;
	}
	
	public static int najcesci(int[] niz) {
		int maxP = 0;
		int maxEl = 0;
		for(int i = 0; i < niz.length; i++) {
			int brPojavljivanja = count(niz, niz[i]);
			if(brPojavljivanja > maxP) {
				maxP = brPojavljivanja;
				maxEl = niz[i];
				}
		}
		
		return maxEl;
	}
	
	public static int sumaPodniza(int[] niz, int l, int k) {
		int suma = 0;
		for(int i = l; i < k; i++) {
			suma += niz[i];
		}
		return suma;
	}

	public static void maxPodniz(int[] niz) {
		int maxSuma = 0;
		int maxD = 0;
		int maxI = 0;
		for(int d = niz.length; d > 0; d--) {
			for(int i = 0; i <= niz.length - d; i++) {
				int sumaP = sumaPodniza(niz, i, i+d);
				if(sumaP > maxSuma) {
					maxSuma = sumaP;
					maxD = d;
					maxI = i;
				}
			}
		}
		
		for(int i = maxI; i < maxI+maxD; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void bubbleSort(int[] niz) {
		for(int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz.length-1; j++) {
				if(niz[j] > niz[j+1]) {
					int temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
				}
			}
		}
		stampaNiza(niz);
	}
	
	public static void rotacija(int[] niz) {
		int temp = niz[0];
		for(int i = 0; i < niz.length-1; i++) {
			niz[i] = niz[i+1];
		}
		niz[niz.length - 1] = temp;
		stampaNiza(niz);
	}
	
	public static int[][] ucitajMatricu(int m, int n){
		Scanner unos = new Scanner(System.in);
		int mat[][] = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = unos.nextInt();
			}
		}
		return mat;
	}
	
	public static void stampaMatrice(int mat[][], int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int zbirIznadGlavne(int[][] mat, int m, int n) {
		int suma = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i < j) suma += mat[i][j];
			}
		}
		return suma;
	} 
	
	public static int zbirIspodGlavne(int[][] mat, int m, int n) {
		int suma = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i > j) suma += mat[i][j];
			}
		}
		return suma;
	} 
	
	public static int zbirIznadSporedne(int mat[][], int m, int n) {
		int suma = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i+j < n-1) {
					suma += mat[i][j];
				}
			}
		}
		return suma;
	}
	
	public static boolean dame(int[][] mat, int m, int n) {
		int i1 = 0, j1 = 0, i2 = 0, j2 = 0;
		int brojac = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == 1 && brojac == 0) {
					i1 = i;
					j1 = j;
					brojac++;
				}
				else if(mat[i][j] == 1) {
					i2 = i;
					j2 = j;
					brojac++;
				}
			}
		}
		
		if((i1 == i2) || (j1 == j2) || (Math.abs(i1 - i2) == Math.abs(j1 - j2))) {
			return true;
		}
		return false;
		
	}
	
	public static int maxElNiz(int[] niz) {
		int maxEl = 0;
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] > maxEl) maxEl = niz[i];
		}
		
		return maxEl;
	}
	
	public static void maxPoVrsti(int[][] mat, int m, int n) {
		int[] maxNiz = new int[n];
		for(int i = 0; i < m; i++) {
			int el = maxElNiz(mat[i]);
			maxNiz[i] = el;
		}
		stampaNiza(maxNiz);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		//int n = unos.nextInt();
		//int[] niz = unesiNiz(n);
		//stampaNiza(niz);
		//razdvoj(niz);
		//System.out.println(count(niz, 4));
		//System.out.println(najcesci(niz));
		//System.out.println(sumaPodniza(niz, 2, 5));
		//maxPodniz(niz);
		//bubbleSort(niz);
		//rotacija(niz);
		//int m, n;
		//m = unos.nextInt();
		//n = unos.nextInt();
		//int mat[][] = ucitajMatricu(m, n);
		//stampaMatrice(mat, m, n);
		//System.out.println(zbirIspodGlavne(mat, m, n));
		//System.out.println(zbirIznadSporedne(mat, m, n));
		//System.out.println(dame(mat, m, n));
		//maxPoVrsti(mat, m, n);

	}

}
