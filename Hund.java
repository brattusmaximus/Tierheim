import java.util.Scanner;


public class Hund extends Supertier {

	
		int alter;
		String name;
		boolean geschlecht;
		double groesse;
		String farbe;
		String lieblingsessen;
		boolean stubenrein;
		
		public Hund(int alt,String nam,boolean gesch, double gro, String far, String essen, boolean stub ){
			alter = alt;
			name = nam;
			geschlecht = gesch;
			groesse = gro;
			farbe = far;
			lieblingsessen = essen;
			stubenrein = stub;
		}
		
		public void spielen(){
			double randNum = (int) Math.random() * 10;
			System.out.println("Wauwau sagt: Ich denke mir eine Zahl zwischen 1 und 10.");
			Scanner k = new Scanner(System.in);
			System.out.println("wenn du die Zahl errätst, darfst du Spielen");
			int rate = k.nextInt();
			if (rate == randNum){
				System.out.println("*Spielt*");
			}
			else {
				System.out.println("Peanut butter on my balls let the dog lick it");
			}
		}
		
		public void machsitz()
		{
			System.out.println("Dein Hund macht sitz, amk");
		}
		
		
	
	public static void main(String[] args) {
		 

	}

}
