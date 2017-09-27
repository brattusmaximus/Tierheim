import java.util.Scanner;
import java.util.*;
public class Tierheim {
	
	
		
		
	public static void main(String[] args) {
		/*Scanner k = new Scanner(System.in);
		System.out.println("Wie viele plätze soll dein Tierheim haben?");
		int i = 0;
		i = k.nextInt();*/
		Supertier[] dBTierheim = new Supertier[5];
		Hund paddy;
		paddy = new Hund(8,"paddy",true,17.00,"rot","fleisch",false);
		Katze leon = new Katze(18,"idiet",true,1.00,"rot","fleisch",false);
		rantier Alex = new rantier(88, "A", false, 14.8, "tonne", "idiet", true);
		dBTierheim[0] = leon;
		dBTierheim[1] = Alex;
		dBTierheim[0] = paddy;
		
		
		

	}

}
