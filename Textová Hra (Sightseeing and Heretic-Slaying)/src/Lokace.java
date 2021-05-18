
public class Lokace {
	private String jmeno;
	private int id;
	private String komentar;
	
	public Lokace(String jmeno, int id, String komentar) {
		super();
		this.jmeno = jmeno;
		this.id = id;
		this.komentar = komentar;
	}

	@Override
	public String toString() {
		return "Nyni se nachazis v "+jmeno+", "+komentar+".";
	}
	
	

}
