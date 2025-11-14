package zad1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner unos = new Scanner(System.in);
		int a = unos.nextInt();
		int b = unos.nextInt();
		
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}

}
