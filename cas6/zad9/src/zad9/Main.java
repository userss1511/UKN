package zad9;

import java.util.Scanner;

public class Main {
	
	public static int zad9(int a, int b, int c) {
		if(a >= b && a >= c) return a;
		else if(b >= a && b >= c) return b;
		else return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 Scanner unos = new Scanner(System.in);
     int a = unos.nextInt();
     int b = unos.nextInt();
     int c = unos.nextInt();
     
     int rez = zad9(a, b, c);
     System.out.println(rez);
     
     //System.out.println(zad9(a, b, c));
	}

}
