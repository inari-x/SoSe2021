package aufgaben.aufgabe6;

public class BruchTest {

	public static void main(String[] args) {
		
		Bruch b1 = new Bruch(3,7);
		Bruch b2 = new Bruch(4,8);
		Bruch b3 = new Bruch(2,5);
		Bruch b4 = new Bruch(5,11);
		Bruch b5 = new Bruch();

		System.out.printf("%n%n------------------------- Rechnen -----------------------------------%n%n");
		System.out.printf("%5s + %5s = %5s %n", b1.toString(), b2.toString(), b1.plus(b2).toString());
		System.out.printf("%5s - %5s = %5s %n", b3.toString(), b4.toString(), b3.minus(b4).toString());
		System.out.printf("%5s * %5s = %5s %n", b1.toString(), b3.toString(), b1.mal(b3).toString());
		System.out.printf("%5s / %5s = %5s %n", b2.toString(), b1.toString(), b2.geteilt(b1).toString());
		System.out.printf("%5s + %5s = %5s %n", b5.toString(), b4.toString(), b5.plus(b4).toString());  
		System.out.printf("%5s - %5s = %5s %n", b1.toString(), b1.toString(), b1.minus(b1).toString());
		
		
		System.out.printf("%n%n------------------------- Vergleichen -----------------------------------%n%n");
		System.out.printf("%5s  > %5s ? %b %n", b1.toString(), b2.toString(), b1.istGroesser(b2));
		System.out.printf("%5s  < %5s ? %b %n", b1.toString(), b2.toString(), b1.istKleiner(b2));
		System.out.printf("%5s == %5s ? %b %n", b1.toString(), b2.toString(), b1.istGleich(b2));
		System.out.printf("%5s  > %5s ? %b %n", b3.toString(), b4.toString(), b3.istGroesser(b4));
		System.out.printf("%5s  < %5s ? %b %n", b3.toString(), b4.toString(), b3.istKleiner(b4));
		System.out.printf("%5s == %5s ? %b %n", b3.toString(), b4.toString(), b3.istGleich(b4));
		System.out.printf("%5s  > %5s ? %b %n", b5.toString(), b5.toString(), b5.istGroesser(b5));
		System.out.printf("%5s  < %5s ? %b %n", b5.toString(), b5.toString(), b5.istKleiner(b5));
		System.out.printf("%5s == %5s ? %b %n", b5.toString(), b5.toString(), b5.istGleich(b5));
		
	}

}
