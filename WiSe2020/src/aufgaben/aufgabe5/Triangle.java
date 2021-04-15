package aufgaben.aufgabe5;

public class Triangle {
	
	private int a;
	private int b;
	private int c;
	
	public Triangle(int pa, int pb, int pc) {
		a = pa;
		b = pb;
		c = pc;
	}
	
	public void print() {
		System.out.printf("%n Seiten         :  a = %d, " + "b = %d, " + "c = %d %n", a, b, c);
		System.out.printf(" Umfang         :  %d %n" , circumference());
		System.out.printf(" Flaecheninhalt :  %.2f %n", area());
		if(equilateral()) {
			System.out.printf(" Das Dreieck ist %s %n",equilateral() ? "gleichseitig" : "unreglemäßig");
		}
		if(isosceles()) {
			System.out.printf(" Das Dreieck ist %s %n",isosceles() ? "gleichschenklig" : "unregelmäßig");
		}
		else {
			System.out.printf(" Das Dreieck ist unregelmäßig %n");
		}
		
		System.out.printf(" Das Dreieck ist %s %n",isRightAngled() ? "rechtwinkling" : "nicht rechtwinklig");
	}
	
	
	public int circumference() {
		int umfang = (a + b + c);
		return umfang;
	}
	
	public double area() {
		double s = ((double)(a + b + c) / 2);
		double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		return A;
	}
	
	public boolean equilateral() {
		boolean gleichseitig = false;
		if((a == b) && (b == c) && (a == c)) {
			gleichseitig = true;
		}
			
		return gleichseitig;
	}
	
	public boolean isosceles() {
		boolean gleichschenklig = false;
		if((a == b) || (b == c) || (a == c)) {
			gleichschenklig = true;
		}
		return gleichschenklig;
	}
	
	public boolean sameCircumference(Triangle t) {
		boolean gleicherUmfang = false;
		if(this.circumference() == t.circumference()) {
			gleicherUmfang = true;
		}
		return gleicherUmfang;
	}
	
	public boolean isSmaller(Triangle t) {
		boolean kleineFläche = false;
		if(this.area() < t.area()) {
			kleineFläche = true;
		}
		return kleineFläche;
	}
	
	public boolean isBigger(Triangle t) {
		boolean großeFläche = false;
		if(this.area() > t.area()) {
			großeFläche = true;
		}
		return großeFläche;
	}
	
	public boolean sidesAreEqual(Triangle t) {
		boolean gleicheLänge = false;
		double ergebnis = (a+b+c);
		if(ergebnis == t.circumference()) {
			gleicheLänge = true;
		}
		return gleicheLänge;
	}
	
	public boolean isRightAngled() {
		boolean rechtwinklig = false;
		if((Math.pow(a, 2) + (Math.pow(b, 2))) == (Math.pow(c, 2))) {
			rechtwinklig = true;
		}
		return rechtwinklig;
	}
	
}
