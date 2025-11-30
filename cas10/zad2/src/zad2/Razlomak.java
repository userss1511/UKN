package zad2;

public class Razlomak {
private int brojilac;
private int imenilac;
private char znak;

public Razlomak(int brojilac, int imenilac, char znak) {
	if(brojilac >= 0) this.brojilac = brojilac;
	else this.brojilac = 0;
	if(imenilac > 0) this.imenilac = imenilac;
	else this.imenilac = 1;
	if(znak == '-' || znak == '+') this.znak = znak;
	else this.znak = '+';
}

public Razlomak() {
	this.brojilac = 0;
	this.imenilac = 1;
	this.znak = '+';
}

public int getBrojilac() {
	return brojilac;
}

public void setBrojilac(int brojilac) {
	if(brojilac >= 0)
	this.brojilac = brojilac;
}

public int getImenilac() {
	return imenilac;
}

public void setImenilac(int imenilac) {
	if(imenilac > 0)
	this.imenilac = imenilac;
}

public char getZnak() {
	return znak;
}

public void setZnak(char znak) {
	if(znak == '+' || znak == '-')
	this.znak = znak;
}

public void dodaj(Razlomak r) {

		int a = (this.znak == '-') ? -this.brojilac : this.brojilac;
		int c = (r.znak == '-') ? -r.brojilac : r.brojilac;
		int noviB = a*r.imenilac + c*this.imenilac;
		int noviI = this.imenilac*r.imenilac;
		char noviZ = (noviB < 0) ? '-' : '+';
		noviB = Math.abs(noviB);
		this.brojilac = noviB;
		this.imenilac = noviI;
		this.znak = noviZ;
	
}

public float konvertuj() {
	return ((this.znak == '-') ? -1 : 1)*(float)this.brojilac/this.imenilac;
}

public Razlomak copyOF() {
	return new Razlomak(this.brojilac, this.imenilac, this.znak);
}

}
