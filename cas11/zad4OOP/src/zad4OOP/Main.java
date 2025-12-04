package zad4OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datum d1 = new Datum(15, 11, 2003);
		Datum d2 = new Datum(26, 11, 2006);
		Datum d3 = new Datum(10, 4, 1968);
		Datum d4 = new Datum(23, 1, 1963);
		//d1.increment();
		//System.out.println(d1.compareTo(d2));
		//System.out.println(d1);
		DatumStack ds = new DatumStack(3);
		ds.push(d2);
		ds.push(d3);
		ds.push(d4);
		ds.push(d1);
		ds.print();
		//System.out.println(ds.pop());
		//System.out.println();
		ds.sortiraj();
		ds.print();
	}

}
