package zad3OOP3;

import java.util.Arrays;

public class Kalendar {
Temperatura[] data;
int indeks;


public Kalendar() {
	this.data = new Temperatura[365];
	this.indeks = 0;
}

public Temperatura vrijemeAt(int index) {
	if(index >= 0 && index <= 364) {
		return this.data[index];
	}
	return null;
}



public void sortiraj() {
	for(int i = 0; i < 364; i++) {
		for(int j = 0; j < 363; j++) {
			if(this.data[j].compareTo(this.data[j+1]) > 0) {
				Temperatura temp = this.data[j];
				this.data[j] = this.data[j+1];
				this.data[j+1] = temp;
			}
		}
	}
}


@Override
public String toString() {
	this.sortiraj();
	for(int i = 0; i < 364; i++) {
		System.out.print(this.data[i] + " ");
	}
	System.out.println();
	return "";
}



}
