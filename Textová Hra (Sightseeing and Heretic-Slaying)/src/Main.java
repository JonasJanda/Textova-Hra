import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Lokace start = new Lokace("Kobce", 0, "ve ktere je jen chlad, sutiny a nejaky mech, ktereho jses radeji ani nedotkl");
		Lokace ruiny = new Lokace("Zricenine", 1, "plne rozpadlych zdi a nabytku. Muselo to vypadat nadherne pred rozpadem");
		Lokace prokletyLes = new Lokace("Lese", 2, "davno opusteni, kam se malokdo opovazil");
		Lokace domov = new Lokace("Stare chate", 3, "prijde ti povedome");
		Lokace posledniLokace = start;
		
		//startovni text
		System.out.println("Jak se probouzis, citis bolest. V te platove zbroji se ti spatne vztava, ale po par pokusech seti podarilo vstat.");
		System.out.println("Po vstani jsi se porozhlidl po tom, kde vlastne jsi.");
		System.out.println();
		
		//kobka
		posledniLokace = start;
		System.out.println(start.toString());
		
		/*
		NPC demon = new NPC("Demon", false, true);
		demon.setIsItDead(true);
		System.out.println(demon.toString());
		*/
		
		scanner.close();
	}

}
