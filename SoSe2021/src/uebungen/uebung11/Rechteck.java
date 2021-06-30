package uebungen.uebung11;


public class Rechteck {
	//private Objektvariablen für x, y, Höhe und Breite 	
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Rechteck(int x, int y, int width, int height) 
	{
		//Koordinaten und Größe des Rechtecks
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;	
	}
	
	// Getter und Setter für x, y, Höhe und Breite	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
		
}
