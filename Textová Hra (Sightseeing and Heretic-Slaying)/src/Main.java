import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//informace
		Scanner scanner = new Scanner(System.in);
		int odpoved = 0;
		int tahy = 1;
		int y = 1;
		int karma = 0;
		ArrayList prosleLokace = new ArrayList<Lokace>();
		
		Texty text1 = new Texty("Zadejte nejakou odpoved");
		Texty textF = new Texty("Zkuste zadat odpoved znova");
		Texty text2 = new Texty("Dejte si na cas, ja pockam");
		Texty text3 = new Texty("Prosim, berte to vazne");
		Texty text4 = new Texty("Varuji vas, prestante delat blbosti");
		Texty text5 = new Texty("Varoval jsem vas");
		
		Lokace start = new Lokace("Kobce", 0, "ve ktere je jen chlad, sutiny a nejaky mech, ktereho jses radeji ani nedotkl");
		Lokace ruiny = new Lokace("Zricenine", 1, "plne rozpadlych zdi a nabytku. Muselo to vypadat nadherne pred nejakou dobou");
		Lokace prokletyLes = new Lokace("Lese", 2, "davno opusteni, kam se malokdo opovazil");
		Lokace domov = new Lokace("Stare chate", 3, "prijde ti povedome");
		Lokace deathTransition = new Lokace("smrt", 4, "padas mrtev");
		
		//startovni text
		System.out.println("Jak se probouzis, citis bolest. V te platove zbroji se ti spatne vztava, ale po par pokusech se ti podarilo vstat.");
		System.out.println("Po vstani jsi se porozhlidl po tom, kde vlastne jsi.");
		System.out.println();
		
		Lokace posledniLokace = start;
		Lokace nynejsiLokace = start;
		prosleLokace.add(start);
		if(nynejsiLokace == deathTransition) {
			nynejsiLokace = posledniLokace;
		}
		//proces hry
		for (int t = 0; t < tahy; t++) {
			//kobka
			if (nynejsiLokace == start) {
				y = 1;
				
				System.out.println(start.toString());
				if (prosleLokace.size() == 1) {
					System.out.println("1. Prozkoumat okolí");
				} else {
					System.out.println("1. Vratit se do zriceniny");
				}
				
				for (int i = 0; i < y; i++) {
					try {
						odpoved = scanner.nextInt();
						if (odpoved == 1) {
							tahy ++;
							karma = 0;
							nynejsiLokace = ruiny;
							posledniLokace = ruiny;
							System.out.println();
							
							
						}else if(karma <= 5){
							System.out.println(text1);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 6) {
							System.out.println(text2);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 7) {
							System.out.println(text3);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 8) {
							System.out.println(text4);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 9) {
							System.out.println(text5);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 10) {
							System.exit(1);
						}
					}catch (InputMismatchException e) {
						if(karma <= 5) {
							System.out.println(textF);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 6) {
							System.out.println(text2);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 7) {
							System.out.println(text3);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 8) {
							System.out.println(text4);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 9) {
							System.out.println(text5);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 10) {
							System.exit(1);
						}
						scanner.nextLine();
					}catch (Exception e) {
						System.out.println("Byla chyba v programu");
						y ++;
						tahy ++;
					}
				}
			}
			
			//ruiny
			if (nynejsiLokace == ruiny){
				y = 1;
				if (prosleLokace.size() == 1) {
					prosleLokace.add(ruiny);
				}
				NPC demon = new NPC("Demon", false, true);
				
				System.out.println(ruiny.toString());
				System.out.println("1. Vratit se do kobky \r2. Najit vychod");
				
				for (int i = 0; i < y; i++) {
					try {
						odpoved = scanner.nextInt();
						if (odpoved == 1) {
							tahy ++;
							karma = 0;
							nynejsiLokace = start;
							posledniLokace = start;
							System.out.println();
							
						}else if(karma <= 5){
							System.out.println(text1);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 6) {
							System.out.println(text2);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 7) {
							System.out.println(text3);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 8) {
							System.out.println(text4);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 9) {
							System.out.println(text5);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 10) {
							System.exit(1);
						}
					}catch (InputMismatchException e) {
						if(karma <= 5) {
							System.out.println(textF);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 6) {
							System.out.println(text2);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 7) {
							System.out.println(text3);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 8) {
							System.out.println(text4);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 9) {
							System.out.println(text5);
							y ++;
							karma ++;
							tahy ++;
						}else if(karma == 10) {
							System.exit(1);
						}
						scanner.nextLine();
					}catch (Exception e) {
						System.out.println("Byla chyba v programu");
						y ++;
						tahy ++;
					}
				}
			}
		}
		
		scanner.close();
	}

}
