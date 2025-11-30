package zad1;

public class Trougao {
private Tacka t1;
private Tacka t2;
private Tacka t3;

public Trougao(Tacka t1, Tacka t2, Tacka t3) {
	this.t1 = t1;
	this.t2 = t2;
	this.t3 = t3;
}

public Trougao(double x1, double y1, double x2, double y2, double x3, double y3) {
	this.t1 = new Tacka(x1, y1);
	this.t2 = new Tacka(x2, y2);
	this.t3 = new Tacka(x3, y3);
}

public boolean validan() {
	double a = this.t1.rastojanjeOdTacke(this.t2);
	double b = this.t1.rastojanjeOdTacke(this.t3);
	double c = this.t3.rastojanjeOdTacke(this.t2);
	if((a+b > c) && (a+c > b) && (b+c > a)) return true;
	return false;
	
}

public double povrsina() {
	double a = this.t1.rastojanjeOdTacke(this.t2);
	double b = this.t1.rastojanjeOdTacke(this.t3);
	double c = this.t3.rastojanjeOdTacke(this.t2);
	double s = (a + b + c)/2;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
}

public double obim() {
	double a = this.t1.rastojanjeOdTacke(this.t2);
	double b = this.t1.rastojanjeOdTacke(this.t3);
	double c = this.t3.rastojanjeOdTacke(this.t2);
	return a + b + c;
}

@Override
public String toString() {
	return t1 + " " + t2 + " " + t3;
}


}
