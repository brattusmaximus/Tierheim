import java.util.Scanner;
public class Katze extends Supertier {
	int alter;
	String name;
	boolean geschlecht;
	double groesse;
	String farbe;
	String lieblingsessen;
	boolean stubenrein;
	
	public Katze(int alt,String nam,boolean gesch, double gro, String far, String essen, boolean stub ){
		alter = alt;
		name = nam;
		geschlecht = gesch;
		groesse = gro;
		farbe = far;
		lieblingsessen = essen;
		stubenrein = stub;
	}
	
	public void machsitz(){
		System.out.println("Ne.");
	}
	public void kuscheln(){
		double randNum = (int) Math.random() * 10;
		System.out.println("Die Katze sagt: Ich denke mir eine Zahl zwischen 1 und 10.");
		Scanner k = new Scanner(System.in);
		System.out.println("wenn du die Zahl errätst, darfst du kuschln");
		int rate = k.nextInt();
		if (rate == randNum){
			System.out.println("*Kuschelt*");
		}
		else {
			System.out.println("Du trittst die Katze in die Ecke und dann kommt sie zurück in den Pokeball");
		}
	}
	

	
	public static void main(String[] args) {
		

	}

}
