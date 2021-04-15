package uebungen.uebung7;

public class Rectangle {
	
	private int a;
	private int b;
	
	public Rectangle() {
	
		a = 10;
		b = 20;
	}

	public Rectangle(int a, int b)  {
		
		this.a = a;
		this.b = b;
	}
	
	public int area() {
		int flaeche;
		flaeche = (a*b);
		
		return flaeche;
		
	}
	
	public int perimeter() {
		int umfang;
		umfang = ((a+b)*2);
		
		return umfang;
	}
	
	public String toString() {
		
		String rechteckString = String.format("Rectangle : ( a = %d, b = %2d, area = %d, perimeter = %d, diagonal = %.3f ) %n", a, b, area(), perimeter(), diagonal());
		
		return rechteckString;
		
	}
	
	public void print() {
		
		System.out.print(toString());
	}
	
	public boolean sidesAreEqual(Rectangle r) {
		boolean gleicheSeiten = false;
			if((r.perimeter()/2) == (this.perimeter()/2)) {
				gleicheSeiten = true;
			}
			return gleicheSeiten;
	}
	
	public boolean areasAreEqual(Rectangle r) {
		boolean gleicheFlaeche = false;
			if(r.area() == this.area()) {
				gleicheFlaeche = true;
			}
			return gleicheFlaeche;
	}
	
	public boolean perimetersAreEqual(Rectangle r) {
		boolean gleicherUmfang = false;
			if(r.perimeter() == this.perimeter()) {
				gleicherUmfang = true;
			}
			return gleicherUmfang;
	}
	
	public void printComparison(Rectangle r) {
		
			System.out.printf("this      " + toString() + "the other " + r.toString() + "%s %n", sidesAreEqual(r) ? "sides are equal " : "sides are not equal");
			System.out.printf("%s %n",areasAreEqual(r) ? "areas are equal" : "areas are not equal");
			System.out.printf("%s %n %n",perimetersAreEqual(r) ? "perimeters are equal" : "perimeters are not equal");

	}
	
	public double diagonal() {
		double rechnung = Math.pow(a, 2) + Math.pow(b, 2);
		double diagonale = Math.pow(rechnung, 0.5);
		
		return diagonale;
	}
	
	public void scale(int factor) {
		double newArea = area()*factor; 
//		if(a > b) {
//			double verhältnis = a/b;
//		if(a < b) {
//			verhältnis =  b/a;
//		
//		double Bruch = verhältnis * 10;
//		double A = (verhältnis * 10 * a * verhältnis * ) 
		double newA = Math.sqrt(newArea/factor);
		double newB = newA*factor;
		double neueFlaeche = newA*newB;
//		}
//		}
		
		System.out.printf("newArea=   %7.2f" + " newA= %4.2f" + " newB= %5.2f" + " check" + " (newA*newB)= %7.2f %n", newArea, newA, newB, neueFlaeche);
	}

}

