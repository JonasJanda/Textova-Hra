import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		/*
		// zadaní B.1
		ArrayList<String> slova = new ArrayList<>();
		
		System.out.println("Zadejte 4 slova: ");
		String slovo;
		int ctyrmistnaSlova = 0;
		for(int i = 0; i < 4; i++) {
			slovo = scr.nextLine();
			slova.add(slovo);
			if(slovo.length() == 4) {
				ctyrmistnaSlova ++;
			}
		}
		for(String a : slova) {
			System.out.print(a+", ");
		}
		System.out.println();
		System.out.println("Mezi slovy jsou "+ctyrmistnaSlova+" ctyrmistnich slov.");
		*/
		// zadani B.2
		ArrayList<Casopis> comicStore = new ArrayList<>();
		Casopis nejlevnejsiCasopis = null;
		
		System.out.println("Jakych 5 casopisu by jste chteli videt v nasem obchode?: ");
		System.out.println("Piste stylem:  jmeno / enter / cena, tim se dostanete na dalsi zapis");
		for(int i = 0; i < 5; i++) {
			String jmeno = scr.next();
			int cena = scr.nextInt();
			comicStore.add(new Casopis(jmeno, cena));
			if(nejlevnejsiCasopis == null) {
				nejlevnejsiCasopis = comicStore.get(i);
			}else if(nejlevnejsiCasopis.getCena() > (comicStore.get(i)).getCena()) {
				nejlevnejsiCasopis = comicStore.get(i);
		    }
		}
		for(Casopis casopisy : comicStore) {
			System.out.println(casopisy+" ");
		}
		System.out.println("Nejlevnejsi z casopisu je "+nejlevnejsiCasopis);
		
		scr.close();
		
		// poznámka pro sebe: jestliže je potøeba v classe Line, použij [Scanner].next();
	}

}
