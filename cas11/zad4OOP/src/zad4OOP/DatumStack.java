package zad4OOP;

public class DatumStack {
Datum[] data;
int kapacitet;
int brElemenata;

public DatumStack(int kapacitet) {
	this.data = new Datum[kapacitet];
	this.kapacitet = kapacitet;
	this.brElemenata = 0;
}

public void push(Datum d) {
	Datum[] temp = new Datum[this.kapacitet];
	for(int i = 0; i < brElemenata; i++) {
		temp[i] = this.data[i];
	}
	if(brElemenata + 1 >= kapacitet) {		
		this.data = new Datum[this.kapacitet + 10];
		this.kapacitet = this.kapacitet + 10;
		for(int i = 0; i < brElemenata; i++) {
			data[i] = temp[i];
		}
	}
	for(int i = 0; i < brElemenata; i++) {
		this.data[i+1] = temp[i];
	}
	this.data[0] = d;
	this.brElemenata++;
}

public void print() {
	for(int i = 0; i < brElemenata; i++) {
		System.out.println(data[i]);
	}
	System.out.println();
}

public Datum pop() {
	if(this.brElemenata > 0) {
		Datum d = this.data[brElemenata-1];
		brElemenata--;
		return d;
	}
	return null;
}

public void sortiraj() {
	for(int i = 0; i < brElemenata; i++) {
		for(int j = 0; j < brElemenata-1; j++) {
			if(this.data[j].compareTo(this.data[j+1]) < 0) {
				Datum temp = this.data[j];
				this.data[j] = this.data[j+1];
				this.data[j+1] = temp;
			}
		}
	}
	
}
}
