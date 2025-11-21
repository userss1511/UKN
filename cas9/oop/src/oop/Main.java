package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil a1 = new Automobil(2021, "bijela", 150, "Audi");
		Automobil a2 = new Automobil();
		//System.out.println(a1.boja);
		//a1.brzina = 100;
		/*System.out.println(a1.getBoja());
		a1.setBoja("crna");
		System.out.println(a1.getBoja());*/
		//a2.setGodinaProizvodnje(1000);
		//System.out.println(a2.getGodinaProizvodnje());
		//System.out.println(a1);
		TeretniAutomobil ta1 = new TeretniAutomobil(2021, "bijela", 150, "Audi", 2000);
		TeretniAutomobil ta2 = new TeretniAutomobil();
		//System.out.println(ta1.getMarka());
		System.out.println(ta1);
	}

}
