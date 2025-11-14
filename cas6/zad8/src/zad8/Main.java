package zad8;

import java.util.Scanner;

public class Main {
	
	public static void zad8(int x) {
		int apsVrijednost = 0;
		
		if(x >= 0) {
			apsVrijednost = x;
		}
		else {
			apsVrijednost = -x;
		}
		
		//int apsVrijednost1 = Math.abs(x);
		
		System.out.println(apsVrijednost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Napisati funkciju koja računa apsolutnu vrijednost nekog broja.
		int n;
		Scanner unos = new Scanner(System.in);
		n = unos.nextInt();
		
		zad8(n);
	
	}

}
