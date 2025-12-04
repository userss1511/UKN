package zad3OOP3;

public class Vrijeme extends Temperatura{
private String opis;



public Vrijeme(int stepen, char jedinica, char znak, String opis) {
	super(stepen, jedinica, znak);
	this.setOpis(opis);
}

public String getOpis() {
	return opis;
}

public void setOpis(String opis) {
	if(opis == "snijeg" || opis == "kisa" || opis == "sunce")
	this.opis = opis;
}

@Override
public String toString() {
	return super.toString() + " " + this.opis;
}




}
