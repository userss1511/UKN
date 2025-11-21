package oop;

public class Automobil {
	private int godinaProizvodnje;
	private String boja;
	private int brzina;
	private String marka;
	
	
	public Automobil(int godinaProizvodnje, String boja, int brzina, String marka) {
		this.godinaProizvodnje = godinaProizvodnje;
		this.boja = boja;
		this.brzina = brzina;
		this.marka = marka;
	}
	
	public Automobil() {
		this.godinaProizvodnje = 2000;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		if(godinaProizvodnje > 1900) {
		this.godinaProizvodnje = godinaProizvodnje;
		}
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		if(brzina > 0) {
		this.brzina = brzina;
		}
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public String toString() {
		return "godinaProizvodnje=" + godinaProizvodnje + ", boja=" + boja + ", brzina=" + brzina
				+ ", marka=" + marka;
	}
	
	
	
	
}
