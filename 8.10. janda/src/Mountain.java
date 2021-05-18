
public class Mountain {
	public String nazev;
	public float vyska;
	
	public String getNazev() {
		return nazev;
	}
    public void setNazev(String novyNazev) {
    	nazev = novyNazev;
    }
    public Mountain(String novyNazev, float novaVyska) {
    	nazev = novyNazev;
    	vyska = novaVyska;
    }
    public Mountain() {
    	nazev = "Snezka";
    	vyska = 1602;
    }
    public float getVyska() {
    	return vyska;
    }
    public String vypis() {
    	return nazev + " " + vyska + "m n.m.";
    }

}
