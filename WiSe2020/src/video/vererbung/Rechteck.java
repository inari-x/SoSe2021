package video.vererbung;

public class Rechteck extends Viereck {
	
	/*
	 * alle Eigenschaften von Viereck sind jetzt geerbt
	 * a, b, c, d
	 * umfang(), print()
	 */
	
	public Rechteck(int laenge, int breite) {
		
		super(laenge, breite, laenge, breite);  //Aufruf des Konstruktors von Viereck
	}
	
	public int flaecheninhalt() {
		
		return this.a * this.b;
	}
	
	@Override
	public void print() {
		
		System.out.print("[ a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + " ]");
		System.out.print(" Umfang des Rechtecks   : " + this.umfang());
		System.out.println(" Flaecheninhalt des Rechtecks   : " + this.flaecheninhalt());
	}
	
}
