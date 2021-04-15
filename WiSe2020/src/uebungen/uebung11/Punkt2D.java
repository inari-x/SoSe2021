package uebungen.uebung11;

public class Punkt2D extends Punkt3D{

	public Punkt2D(int x, int y) {
		super(x, y, 0);
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d)", this.getX(), this.getY());
	}
	
}
