package zad3OOP3;

public class Temperatura {
private int stepen;
private char jedinica;
private char znak;

public Temperatura(int stepen, char jedinica, char znak) {
	this.setStepen(stepen);
	this.setJedinica(jedinica);
	this.setZnak(znak);
}

public Temperatura() {
	this.stepen = 0;
	this.jedinica = 'C';
	this.znak = '+';
}

public int getStepen() {
	return stepen;
}
public void setStepen(int stepen) {
	if(stepen >= 0 && stepen <= 100)
	this.stepen = stepen;
}
public char getJedinica() {
	return jedinica;
}
public void setJedinica(char jedinica) {
	if(jedinica == 'C' || jedinica == 'F')
	this.jedinica = jedinica;
}
public char getZnak() {
	return znak;
}
public void setZnak(char znak) {
	if(znak == '+' || znak == '-')
	this.znak = znak;
}


public void convertToCelsius() {
	if(this.jedinica == 'C') return;
	int f = (this.znak == '+' ? 1 : -1)*this.stepen;
	int c = (f - 32)*5/9;
	if(c < 0) {
		this.znak = '-';
		this.stepen = Math.abs(c);
	}
	else {
		this.znak = '+';
		this.stepen = c;
	}
	this.jedinica = 'C';
}

public void convertToFarenheit() {
	if(this.jedinica == 'F') return;
	int c = (this.znak == '+' ? 1 : -1) * this.stepen;
	int f = c*9/5 + 32;
	if(f < 0) {
		this.znak = '-';
		this.stepen = Math.abs(f);
	}
	else {
		this.znak = '+';
		this.stepen = f;
	}
	
	this.jedinica = 'F';
}

public int compareTo(Temperatura t) {
	this.convertToCelsius();
	t.convertToCelsius();
	int temp1 = (this.znak == '+' ? 1 : -1)*this.stepen;
	int temp2 = (t.znak == '+' ? 1 : -1)*t.stepen;
	if(temp1 > temp2) return -1;
	else if(temp1 < temp2) return 1;
	else return 0;
}

@Override
public String toString() {
	return (this.znak == '+' ? "" : "-") + this.stepen + this.jedinica;
}



}
