package zad6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner unos = new Scanner(System.in);
		
		int n = unos.nextInt();
		
		int sumaD = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sumaD = sumaD + i;
			}
		}
		
		if(n == sumaD) {
			System.out.println("Broj je savrsen");
		}
		else {
			System.out.println("Broj nije savrsen");
		}
	}

}
