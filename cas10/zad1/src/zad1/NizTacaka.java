package zad1;

public class NizTacaka {
private int kapacitet;
private int pop;
private Tacka[] niz;

public NizTacaka() {
	this.kapacitet = 100;
	this.pop = 0;
	this.niz = new Tacka[100];
}

public void dodajTacku(Tacka t) {
	niz[pop] = t;
	pop++;
}

public Tacka elementNaPoziciji(int p) {
	if(p < pop) return niz[p];
	return null;
}

public void ukloniTacku() {
	if(pop > 0) pop--;
}

public int postoji(Tacka t) {
	for(int i = 0; i < pop; i++) {
		Tacka tren = this.niz[i];
		if(tren.equals(t)) return i;
	}
	return -1;
}

public void ukloniTacku1(Tacka t) {
int ind = this.postoji(t);
if(ind != -1) {
	for(int i = ind; i < pop-1; i++) {
		this.niz[i] = this.niz[i+1];
	}
}
pop--;
}

public void stampa() {
	for(int i = 0; i < pop; i++) {
		System.out.print(this.niz[i]);
	}
	System.out.println();
}

public int length() {
	return pop;
}

public void sortirajPoRastojanjuOdTacke(Tacka t) {
	for(int i = 0; i < pop; i++) {
		for(int j = 0; j < pop-1; j++) {
			if(this.niz[j].rastojanjeOdTacke(t) > this.niz[j+1].rastojanjeOdTacke(t)) {
				Tacka temp = niz[j];
				niz[j] = niz[j+1];
				niz[j+1] = temp;
			}
		}
	}
}


}
