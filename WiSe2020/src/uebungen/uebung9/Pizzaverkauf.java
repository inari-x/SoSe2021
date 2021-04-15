package uebungen.uebung9;

public class Pizzaverkauf {
	
	private Pizza pizza;
	private int anzVerkaeufe;
	
	public Pizzaverkauf(Pizza pizza) {
		
		this.pizza = pizza;
		this.anzVerkaeufe = 0;
	}
	
	public int verkaufen() {
		
		return anzVerkaeufe++;
	}
	
	public int getAnzVerkaeufe() {
		
		return this.anzVerkaeufe;
	}
	
	public Pizza getPizza() {
		
		return this.pizza;
	}
	
	public double umsatz() {
		
		return this.anzVerkaeufe*pizza.getPreis();
	}
	
	@Override
	public String toString() {
		
		String n = "";
		n = String.format("Pizza %s wurde %d mal zum Preis von %.2f Euro verkauft.%n", pizza.getName(), this.anzVerkaeufe, pizza.getPreis());
		return n;
	}
	
	public void print() {
		
		System.out.print(toString());
	}

}
