
public class Drink {
	public String nazev;
	public float cena;
	public float alkohol;
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String novyNazev) {
		nazev = novyNazev;
	}
	
	public float getCena() {
		return cena;
	}
	public void setCena(float novaCena) {
		cena = novaCena;
	}
	public float getAlkohol() {
		return alkohol;
	}
	public void setAlkohol(float novyAlkohol) {
		alkohol = novyAlkohol;
	}
	public Drink(String novyNazev, float novaCena, float novyAlkohol) {
		cena = novaCena;
		alkohol = novyAlkohol;
	}
	public Drink() {
		nazev = "limonada";
		cena = 20;
		alkohol = 0;
	}


}
