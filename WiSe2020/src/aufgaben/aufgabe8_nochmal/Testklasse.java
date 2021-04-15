package aufgaben.aufgabe8_nochmal;

public class Testklasse {

	public static void main(String[] args) {
		System.out.printf("%n%n---------------- Test Mensch ---------------%n%n");
		Mensch m1 = new Mensch("A", 20);
		m1.print();
		m1.geburtstag();
		
		Mensch m2 = new Mensch("B", 25);
		m2.print();
		m2.geburtstag();
		
		System.out.printf("%n%n---------------- Test Mensch ---------------%n%n");
		Studentin s1 = new Studentin("C", 22, "FIW");
		Studentin s2 = new Studentin("D", 23, "FIW");
		s1.print();
		s2.print();
		
		System.out.printf("%n%n---------------- Test Studiengaenge ---------------%n%n");
		Studiengaenge sg = new Studiengaenge(10,10);
		sg.immatrikulieren(20);
		sg.printFIW();
		sg.printAI();
		sg.printdurchschnittsalter();
	}
		
}


