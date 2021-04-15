package uebungen.uebung11;

public class Strecke {
	
	private Punkt2D start;
	private Punkt2D ende;
	
	public Strecke(Punkt2D start, Punkt2D ende) {
		
		this.start = start;
		this.ende = ende;
	}
	
	public Strecke(int x1, int y1, int x2, int y2) {
		this.start = new Punkt2D(x1, y1);
		this.ende = new Punkt2D(x2, y2);
	}
	
	public double laenge() {
		int diffX = Math.abs(start.getX() - ende.getX());
        int diffY = Math.abs(start.getY() - ende.getY());
        int diffX2 = diffX * diffX;
        int diffY2 = diffY * diffY;
        double laenge = Math.sqrt(diffX2 + diffY2);
        return laenge;
	}
	
	@Override
	public String toString() {
		String s = String.format("Strecke [start=%s, ende=%s, Laenge=%7.4fcm]", start.toString(), ende.toString(), this.laenge());
        return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}

}

