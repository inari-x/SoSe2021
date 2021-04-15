package aufgaben.aufgabe5_nochmal;

public class Triangle {
	
	private int a;
	private int b;
	private int c;
	
	public Triangle(int pa, int pb, int pc) {
		this.a = pa;
		this.b = pb;
		this.c = pc;
	}
	
	public void print() {
		System.out.printf("Seiten         : a=%d, b=%d, c=%d%n", this.a, this.b, this.c);
		System.out.printf("Umfang         : %d%n", this.circumference());
		System.out.printf("Flaecheninhalt : %.1f%n", this.area());
		System.out.println();
	}
	
	public int circumference() {
		return (this.a + this.b + this.c);
	}
	
	public double area() {
		double s = (double)(this.a + this.b + this.c)/2;
		double A = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		return A;
	}
	
	public boolean equilaeral() {
		if(this.a == this.b && this.a == this.c && this.b == this.c) {
			return true;
		}
		return false;
	}
	
	public boolean isosceles() {
		if(this.a == this.b || this.a == this.c || this.b == this.c) {
			return true;
		}
		return false;
	}

}
