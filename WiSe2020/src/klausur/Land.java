package klausur;

import java.util.Random;

public class Land {
	
	private String name;
	private int groesse;
	private int einwohner;
	
	
	public String getName() {
		return this.name;
	}
	public int getGroesse() {
		return this.groesse;
	}
	public int getEinwohner() {
		return this.einwohner;
	}
	
	public String erzeugenName() {
		Random r = new Random();
		String s = "";
		int nummer = r.nextInt(10);
		int from = 65;
		int till = 90;
		int buchstabe = r.nextInt(till-from)+till;
		buchstabe = (char)buchstabe;
		s = String.format("%C%d",buchstabe, nummer);
		return s;
	} 
	
	public Land() {
		Random r = new Random();
		this.name = erzeugenName();
		this.groesse = r.nextInt(100) + 1;
		this.einwohner = r.nextInt(1000) + 1;
	}
	
	public double ewDichte() {
		return (this.einwohner%this.groesse);
	}
	
	@Override
	public String toString() {
		String s = String.format(this.name + " : " + "%2d km2 :  %3d ew :  %.4f",this.groesse, this.einwohner, ewDichte());
		return s;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public boolean istGroesser(Land land) {
		return this.groesse > land.groesse;
	}
	
	public boolean hatMehrEinwohner(Land land) {
		return this.einwohner > land.einwohner;
	}
	
	public boolean nameIstGroesser(Land land) {
		if(this.name.length()>(land.name.length())) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		Land l = (Land)o;
		return this.name == l.name;
	}
	
	
	
	
	

}
