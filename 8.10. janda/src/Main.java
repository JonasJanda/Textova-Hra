
public class Main {
	public static void main(String[]args) {
	Mountain mountain = new Mountain();
	Mountain secondMountain = new Mountain("Praded",1440);
	
	System.out.println(mountain.getNazev()+" "+mountain.getVyska()+"m n.m.");
	System.out.println(secondMountain.getNazev()+" "+secondMountain.getVyska()+"m n.m.");
	}
	public static void {
	Drink d1 = new Drink("Vino",120,10);
	Drink d2 = new Drink("Mineralka",15,0);
	Drink d3 = new Drink();
	
	System.out.println(d1.getNazev()+" "+d1.getCena()+" "+d1.getAlkohol());
	System.out.println(d2.getNazev()+" "+d2.getCena()+" "+d2.getAlkohol());
	System.out.println(d3.getNazev()+" "+d3.getCena()+" "+d3.getAlkohol());
	}
}
