package zad5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner unos = new Scanner(System.in);
		int n;
		n = unos.nextInt();
		
		while(n % 2 == 0) {
			n = n / 2;
		}
		
		if(n == 1) {
			System.out.println("Broj je stepen dvojke.");
		}
		else {
			System.out.println("Broj nije stepen dvojke.");
		}
	}

}
