package aufgaben.aufgabe5;

public class TriangleNochmal {
	
	private int a;
	private int b;
	private int c;
	
	public TriangleNochmal(int pa, int pb, int pc) {
		a = pa;
		b = pb;
		c = pc;
	}
	
	public void print() {
		System.out.printf("Seiten       : " + a + " = " + " %d, " + b + " = " + " %d, " + c + " = " + " %d ", a,b,c);
	}

}
