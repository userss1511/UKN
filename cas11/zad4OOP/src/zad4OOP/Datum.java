package zad4OOP;

public class Datum {
private int dan;
private int mjesec;
private int godina;


public Datum(int dan, int mjesec, int godina) {
	this.setGodina(godina);
	this.setMjesec(mjesec);
	this.setDan(dan);
}

public Datum() {
	this.dan = 1;
	this.mjesec = 1;
	this.godina = 2000;
}


public int getDan() {
	return dan;
}
public void setDan(int dan) {
	if(this.mjesec == 1 || this.mjesec == 3 || this.mjesec == 5 || this.mjesec == 7 || this.mjesec == 8 || this.mjesec == 10 || this.mjesec == 12) {
		if(dan >= 1 && dan <= 31) this.dan = dan;
	}
	if(this.mjesec == 4 || this.mjesec == 6 || this.mjesec == 9 || this.mjesec == 11) {
		if(dan >= 1 && dan <= 30) this.dan = dan;
	}
	
	if(this.mjesec == 2) {
		if(dan >= 1 && dan <= 28) this.dan = dan;
	}
	
}
public int getMjesec() {
	return mjesec;
}
public void setMjesec(int mjesec) {
	if(mjesec >= 1 && mjesec <= 12)
	this.mjesec = mjesec;
}
public int getGodina() {
	return godina;
}
public void setGodina(int godina) {
	if(godina >= 1900)
	this.godina = godina;
}


public void increment() {
	int noviD = this.dan, noviM = this.mjesec, novaG = this.godina;
	if(this.mjesec == 1 || this.mjesec == 3 || this.mjesec == 5 || this.mjesec == 7 || this.mjesec == 8 || this.mjesec == 10) {
		if(this.dan + 1 > 31) {
			noviD = 1;
			noviM = this.mjesec + 1;
		}
		else noviD = this.dan + 1;
	}
	
	if(this.mjesec == 4 || this.mjesec == 6 || this.mjesec == 9 || this.mjesec == 11) {
		if(this.dan + 1 > 30) {
			noviD = 1;
			noviM = this.mjesec + 1;
		}
		else noviD = this.dan + 1;
	}
	if(this.mjesec == 2) {
		if(this.dan + 1 > 28) {
			noviD = 1;
			noviM = 3;
		}
		else noviD = this.dan + 1;
	}
	
	if(this.mjesec == 12) {
		if(this.dan + 1 > 31) {
			noviD = 1;
			noviM = 1;
			novaG = this.godina + 1;
		}
		else noviD = this.dan + 1;
	}
	
	this.dan = noviD;
	this.mjesec = noviM;
	this.godina = novaG;
	
}

@Override
public String toString() {
	return dan + "." + mjesec + "." + godina + ".";
}

public int compareTo(Datum d) {
	if(this.godina < d.godina) return -1;
	else if(this.godina > d.godina) return 1;
	else {
		if(this.mjesec < d.mjesec) return -1;
		else if(this.mjesec > d.mjesec) return 1;
		else {
			if(this.dan < d.dan) return -1;
			else if(this.dan > d.dan) return 1;
			else return 0;
		}
	}
	
}


}
