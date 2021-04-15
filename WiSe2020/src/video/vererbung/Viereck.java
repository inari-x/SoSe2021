package video.vererbung;

public class Viereck {
	
	/* 
	 * alles von der Klasse Object geerbt (Methoden)
	 * getClass(), toString(), equals(), hashCode()
	 */
	
	protected int a, b, c, d;
	
	public Viereck(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public int umfang() {
		
		return this.a + this.b + this.c + this.d;
	}
	
	@Override
	public String toString() {
		
		return "[ a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + " ]";
	}
	
	public void print() {
		
		System.out.print(this.toString());
		System.out.println(" Umfang des Vierecks   : " + this.umfang());
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		
		// o ist vom Laufzeittyp viereck
		Viereck v = (Viereck)o;
		
		return this.a==v.a && b==v.b && this.c==v.c && this.d==v.d;
	}
	
	@Override
	public int hashCode() {
		
		return this.a + this.b + this.c + this.d;
	}
	
	
	

}
