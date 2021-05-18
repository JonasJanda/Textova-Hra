import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int pocet = 0;
		int prumer = 0;
		int zaporneCislo = 0;
		int kladneCislo = 0;
		int ciferneCislo = 0;
		int nejvetsiCislo = 0;
		int nejmensiCislo = 0;
		
		for(int i = 0; i < 20; i++) {
			int cislo = rng.nextInt() % 101;
			System.out.print(cislo + " ");
			prumer = prumer + cislo;
			pocet ++;
			if(cislo < 0) {
				zaporneCislo ++;
			}else {
				kladneCislo ++;
			}
			if(cislo < 10 & cislo > -10) {
				ciferneCislo ++;
			}
			if(cislo > nejvetsiCislo) {
				nejvetsiCislo = cislo;
			}
			if(cislo < nejmensiCislo) {
				nejmensiCislo = cislo;
			}
		}
		System.out.println();
		System.out.println("Aritmeticky prumer je: "+ prumer / pocet);
		System.out.println("Kladnych cisel je dohromady: "+kladneCislo+", a zapornych cisel je: "+zaporneCislo);
		System.out.println("Cifernych cisel je dohromady: "+ciferneCislo);
		System.out.println("Nejvetsi cislo je: "+nejvetsiCislo);
		System.out.println("Nejmensi cislo je: "+nejmensiCislo);
	}
}