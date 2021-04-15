package uebungen.uebung11_nochmal;

public class Punkt2D extends Punkt3D{
	
	public Punkt2D(int x, int y) {
		super(x, y, 0);
	}
	
	@Override
	public String toString() {
		String s = String.format("(%d,%d)", this.getX(), this.getY());
		return s;
	}
}
