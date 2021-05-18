
public class Casopis {
	private String jmeno;
	private int cena;
	
	public Casopis(String jmeno, int cena) {
		super();
		this.jmeno = jmeno;
		this.cena = cena;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Casopis " + jmeno + ", stoji " + cena + "Kc";
	}
	
	

}
