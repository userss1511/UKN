package zad7;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		for(int i = 0; i < 7; i++) {
			int broj = r.nextInt(1, 40); // 1 <= broj < 40
			System.out.println(broj);
		}
	}

}
