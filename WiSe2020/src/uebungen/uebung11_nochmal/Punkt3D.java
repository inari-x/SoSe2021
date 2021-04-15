package uebungen.uebung11_nochmal;

public class Punkt3D {
	private int x;
	private int y;
	private int z;
	
	public Punkt3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getZ() {
		return this.z;
	}
	
	@Override
	public String toString()  {
		String s = String.format("(%d,%d,%d)", this.x, this.y, this.z);
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		Punkt3D p = (Punkt3D)o;
		return this.x == p.x && this.y == p.y && this.z == p.z;
	}
	
	public boolean xIsSmaller(Punkt3D p) {
		return this.x < p.x;
	}
	
	public boolean yIsSmaller(Punkt3D p) {
		return this.y < p.y;
	}
	
	public boolean zIsSmaller(Punkt3D p) {
		return this.z < p.z;
	}
	
	
	
	
}
