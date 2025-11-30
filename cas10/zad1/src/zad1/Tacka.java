package zad1;

public class Tacka {
private double x;
private double y;

public Tacka(double x, double y) {
	this.x = x;
	this.y = y;
}

public Tacka() {
	this.x = 0;
	this.y = 0;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public double rastojanjeOdTacke(Tacka t) {
	double d = Math.sqrt((this.x - t.x)*(this.x - t.x) + (this.y - t.y)*(this.y - t.y));
	return d;
}

@Override
public String toString() {
	return "(" + x + ", " + y + ")";
}

public int kvadrant() {
	if(x >= 0 && y >= 0) return 1;
	else if(x < 0 && y >= 0) return 2;
	else if(x < 0 && y < 0) return 3;
	return 4;
}

public boolean equals(Tacka t) {
	if(this.x == t.x && this.y == t.y) return true;
	return false;
}

}
