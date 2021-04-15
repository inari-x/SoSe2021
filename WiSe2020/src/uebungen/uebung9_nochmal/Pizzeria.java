package uebungen.uebung9_nochmal;

import java.util.Random;

public class Pizzeria {
	private Pizzaverkauf[] verkaeufe;
	
	public Pizzeria(Speisekarte karte) {
		this.verkaeufe = new Pizzaverkauf[karte.getLength()];
		for (int i = 0; i < this.verkaeufe.length; i++) {
			this.verkaeufe[i] = new Pizzaverkauf(karte.getPizzaAtIndex(i));
		}
	}
	
	public int bestellen() {
		Random r = new Random();
		int index = r.nextInt(this.verkaeufe.length);
		return index;
	}
	
	public void verkaufen(int index) {
		if(index >= 0 && index < this.verkaeufe.length) {
			this.verkaeufe[index].verkaufen();
		}
	}
	
	public void tagesVerkauf(int anzVerkaeufe) {
		for(int i = 0; i < anzVerkaeufe; i++) {
			int index = this.bestellen();
			this.verkaufen(index);
		}
	}
	
	public void print() {
		for (int i = 0; i < this.verkaeufe.length; i++) {
			Pizza p = this.verkaeufe[i].getPizza();
			int anzVerkaeufe = this.verkaeufe[i].getAnzVerkaeufe();
			String s = String.format("%-13s : ", p.getName());
			for (int start = 0; start < anzVerkaeufe; start++) {
				s += "*";
			}
			System.out.println(s);
		}
	}
	
	public Pizza meistverkauftePizza() {
		int max = 0;
		for (int i = 0; i < this.verkaeufe.length; i++) {
			if(this.verkaeufe[i].getAnzVerkaeufe() > this.verkaeufe[max].getAnzVerkaeufe()) {
				max = i;
			}
		}
		return this.verkaeufe[max].getPizza();
	}
	
	public double gesamtEinnahmen() {
		double gesamtEinnahmen = 0.0;
		for (int i = 0; i < this.verkaeufe.length; i++) {
			gesamtEinnahmen += this.verkaeufe[i].umsatz();
		}
		return gesamtEinnahmen;
	}
	
	
}

