package zad3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Za dati broj, štampati njegove djelioce.
		Scanner unos = new Scanner(System.in); 
		int n = unos.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
