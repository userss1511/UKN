package oop;

public class TeretniAutomobil extends Automobil {
	private int nosivost;

	public TeretniAutomobil(int godinaProizvodnje, String boja, int brzina, String marka, int nosivost) {
		super(godinaProizvodnje, boja, brzina, marka);
		this.nosivost = nosivost;
	}
	
	public TeretniAutomobil() {
		super();
		this.nosivost = 0;
	}

	public int getNosivost() {
		return nosivost;
	}

	public void setNosivost(int nosivost) {
		if(nosivost > 0) {
		this.nosivost = nosivost;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", nosivost=" + nosivost + " ";
	}
	
	
	

}
