package uebungen.uebung7_nochmal;

public class Rectangle {
	
	private int a;
	private int b;
	
	public Rectangle() {
		this.a = 10;
		this.b = 20;
	}
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int area() {
		return this.a*this.b;
	}
	
	public int perimeter() {
		return 2*(this.a+this.b);
	}
	
	public String toString() {
		String s = String.format("Rectangle : ( a=%2d, b=%2d, area=%3d, perimeter=%2d, diagonal=%6.3f )", 
                this.a, this.b, this.area(), this.perimeter(), this.diagonal());
        return s;   
	}
	
	public void print() {
		System.out.print(this.toString());
	}
	
	public boolean sidesAreEqual(Rectangle r) {
		return (this.a == r.a && this.b == r.b) || (this.a == r.b && this.b == r.a);
	}
	
	public boolean areasAreEqual(Rectangle r) {
		return (this.area() == r.area());
	}
	
	public boolean perimetersAreEqual(Rectangle r) {
		return (this.perimeter() == r.perimeter());
	}
	
	public void printComparison(Rectangle r) {
		String s =  String.format("this      %50s %n", this.toString());
        s +=        String.format("the other %50s %n", r.toString());
        if(this.sidesAreEqual(r))
        {
            s += String.format("sides are equal %n");
        }
        else
        {
            s += String.format("sides are not equal %n");
        }
        if(this.areasAreEqual(r))
        {
            s += String.format("areas are equal %n");
        }
        else
        {
            s += String.format("areas are not equal %n");
        }
        if(this.perimetersAreEqual(r))
        {
            s += String.format("perimeters are equal %n");
        }
        else
        {
            s += String.format("perimeters are not equal %n");
        }
        System.out.println(s);
	}
	
	public double diagonal() {
		return Math.sqrt(this.a * this.a + this.b * this.b);
	}
	
	public void scale(int factor)
    {
        double newArea = factor * this.area();
        double aNew = Math.sqrt(factor * this.a * this.a);
        double bNew = Math.sqrt(factor * this.b * this.b);
        System.out.printf("newArea=%8.2f newA=%6.2f newB=%6.2f check (newA*newB)=%7.2f%n", newArea, aNew, bNew, (aNew*bNew));   
    }
	
	public Rectangle doubleSides()
    {
        int newA = this.a * 2;
        int newB = this.b * 2;
        Rectangle newRec = new Rectangle(newA, newB);
        return newRec;
    }

}
