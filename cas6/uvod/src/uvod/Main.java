package uvod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println();
		//sysout
		
		int a = 12;
		double b = 3.01;
		float c = (float) 3.1;
		char d = 'a';
		boolean ind1 = true;
		boolean ind2 = false;
		System.out.println(ind1);
		String str = "Programiranje!";
		//\n 
		/* \t
		\" */
		
		Scanner unos = new Scanner(System.in);
		/*int broj = unos.nextInt();
		int broj1 = unos.nextInt();
		System.out.println(broj + " " + broj1);
		System.out.println("Broj koji smo unijeli je: " + broj);*/
		
		// + -> sabiranje
		// - -> oduzimanje
		// * -> mnozenje
		// / -> int/int(div)
		// % -> mod 
		
		/*broj = broj + 1;
		broj++;
		broj += 1;*/
		
		// ==   !=   <    >   <=   >=  -> operatori poredjenja
		
		// && - AND  || - OR   ! -> NEGATION - logicki operatori
		
		
		/*if(broj1 > broj) {
			
		}
		else if(broj1 < broj) {
			
		}
		else {
			
		}*/
		int brojac = 1;
		while(brojac <= 10) {
		if(brojac == 5) {
			brojac = brojac + 1;
			continue;
		}
		System.out.println(brojac);
		brojac = brojac + 1;
		}
		
		
		/*for(int i = 0; i < 5; i++) {
			System.out.println("Programranje");
		}*/
		
		int n = unos.nextInt();
		//1-> ponedeljak, 2-> utorak ... 7-> nedelja
		
		switch(n) {
		 
		case 1: 
			System.out.println("Ponedeljak");
			break;
		case 2:
			System.out.println("Utorak");
			break;
		case 3:
			System.out.println("Srijeda");
			break;
		case 4:
			System.out.println("Cetvrtak");
			break;
		case 5:
			System.out.println("Petak");
			break;
		case 6:
			System.out.println("Subota");
			break;
		case 7:
			System.out.println("Nedelja");
			break;
		}
		
	}

}
