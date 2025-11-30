package zad1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tacka t1 = new Tacka(-1, 0);
		Tacka t2 = new Tacka();
//		System.out.println(t1.rastojanjeOdTacke(t2));
//		System.out.println(t1);
//		System.out.println(t1.kvadrant());
		Tacka t3 = new Tacka(5, 1);
		Tacka t4 = new Tacka(8, 8);
		Trougao trougao1 = new Trougao(t1, t2, t3);
		//System.out.println(trougao1);
//		System.out.println(trougao1.validan());
//		System.out.println(trougao1.povrsina());
//		System.out.println(trougao1.obim());
		NizTacaka nt1 = new NizTacaka();
		nt1.dodajTacku(t1);
		nt1.dodajTacku(t2);
		nt1.dodajTacku(t3);
		nt1.stampa();
		//nt1.ukloniTacku();
		//nt1.ukloniTacku1(t2);
		nt1.sortirajPoRastojanjuOdTacke(t4);
		nt1.stampa();
	}

}
