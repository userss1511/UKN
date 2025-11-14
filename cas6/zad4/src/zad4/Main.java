package zad4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Napisati program koji štampa sve proste brojeve iz segmenta [a, b].
		Scanner unos = new Scanner(System.in);
		int a = unos.nextInt();
		int b = unos.nextInt();
		
		for(int i = a; i <= b; i++) {
			int brD = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					brD += 1;
				}
			}
			if(brD == 2) {
				//U pitanju je prost broj
				System.out.println(i);
			}
			
		}
		
	}

}
