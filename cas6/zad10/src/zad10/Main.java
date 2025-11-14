package zad10;

import java.util.Scanner;

public class Main {

	public static void zad10(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n-1; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		int n = unos.nextInt();
		zad10(n);
	}

}
