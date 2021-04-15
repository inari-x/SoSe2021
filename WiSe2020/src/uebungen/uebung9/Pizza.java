package uebungen.uebung9;

public class Pizza {
	
	private String name;
	private float preis;
	
	public Pizza(String name, float preis) {
		
		this.name = name;
		this.preis = preis;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public float getPreis() {
		
		return this.preis;
	}
	

	public String toString() {
		
		String s = "";
		s = String.format("Die Pizza %s kostet %.2f Euro.%n",this.name, this.preis);
		
		return s;
	}
	
	public void print() {
		
		System.out.print(toString());
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		
		Pizza name = (Pizza)o;
		
		return this.name==name.name;
	}

}
