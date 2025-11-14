package zad2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Štampaj broj cifara nekog broja.
		
		Scanner unos = new Scanner(System.in);
		
		int n = unos.nextInt();
		int brojCifara = 0;
		while(n > 0) {
			brojCifara = brojCifara + 1;
			n = n / 10;
		}
		
		System.out.println("Broj cifara naseg broja je: " + brojCifara);
	}

}
