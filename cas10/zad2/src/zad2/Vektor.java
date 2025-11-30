package zad2;

public class Vektor {
private Razlomak[] data;
private int numOfElems;

public Vektor() {
	this.data = new Razlomak[1000];
	this.numOfElems = 0;
}

public void dodaj(Razlomak r) {
	this.data[this.numOfElems] = r;
	this.numOfElems++;
}

public boolean uslov(int ind, int d, Razlomak r) {
	for(int i = ind; i < ind+d; i++) {
		if(this.data[i].konvertuj() <= r.konvertuj()) return false;
	}
	return true;
}

public int najduziPodniz(Razlomak r) {
	for(int d = this.numOfElems; d > 0; d--) {
		for(int i = 0; i <= this.numOfElems - d; i++) {
			boolean ind = uslov(i, d, r);
			if(ind) return d;
		}
	}
	return -1;
}

public boolean nazubljen() {
	for(int i = 1; i < this.numOfElems-1; i++) {
		if(!((this.data[i-1].konvertuj() < this.data[i].konvertuj() && this.data[i+1].konvertuj() < this.data[i].konvertuj())
		 || (this.data[i-1].konvertuj() > this.data[i].konvertuj() && this.data[i+1].konvertuj() > this.data[i].konvertuj()))) return false; 
		
	}
	return true;
}


}
