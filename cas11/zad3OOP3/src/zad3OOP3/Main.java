package zad3OOP3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Temperatura t1 = new Temperatura(10, 'C', '+');
		Temperatura t2 = new Temperatura(10, 'C', '-');
		//System.out.println(t2.compareTo(t1));
		//System.out.println(t2);
		Vrijeme v1 = new Vrijeme(10, 'C', '+', "sunce");
		//System.out.println(v1);
		Kalendar k = new Kalendar();
		Random r = new Random();
		char j[] = {'C', 'F'};
		char z[] = {'+', '-'};
		for (int i = 0; i < 365; i++) {
		    int stepen = r.nextInt(1, 50);
		    char jedinica = j[r.nextInt(2)];
		    char znak = z[r.nextInt(2)];

		    k.data[i] = new Temperatura(Math.abs(stepen), jedinica, znak);
		}
		System.out.println(k);
		
	}

}
