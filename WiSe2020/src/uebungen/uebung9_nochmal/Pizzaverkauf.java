package uebungen.uebung9_nochmal;

public class Pizzaverkauf {

	private Pizza pizza;
	private int anzVerkaeufe;
	
	public Pizzaverkauf(Pizza pizza) {
		this.pizza = pizza;
		this.anzVerkaeufe = 0;
	}
	
	public void verkaufen() {
		this.anzVerkaeufe++;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public int getAnzVerkaeufe() {
		return this.anzVerkaeufe;
	}
	
	public double umsatz() {
		return this.anzVerkaeufe*this.pizza.getPreis();
	}
	
	public String toString() {
		return "Pizza " + this.pizza.getName() + " wurde " + this.anzVerkaeufe + " mal zum Preis von " + this.pizza.getPreis() + " Euro verkauft.";
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	
	
}
