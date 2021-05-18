
public class Zvire {
	private String druh;
	private int vyska;
	private int spotrebaZradla;
	
	public Zvire(String druh, int vyska, int spotrebaZradla) {
		super();
		this.druh = druh;
		this.vyska = vyska;
		this.spotrebaZradla = spotrebaZradla;
	}
	
	public String getDruh() {
		return druh;
	}
	public void setDruh(String druh) {
		this.druh = druh;
	}
	public int getVyska() {
		return vyska;
	}
	public void setVyska(int vyska) {
		this.vyska = vyska;
	}
	public int getSpotrebaZradla() {
		return spotrebaZradla;
	}
	public void setSpotrebaZradla(int spotrebaZradla) {
		this.spotrebaZradla = spotrebaZradla;
	}

	@Override
	public String toString() {
		return druh + " je vysoky/vysoka " + vyska + "cm a spotrebuje " + spotrebaZradla + "g zradla," +  "\n";
	}

	
	

}
